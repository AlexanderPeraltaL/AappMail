package com.alexander.appmail;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
    private List<ListElements> misDatos;
    private LayoutInflater myInflater;
    private Context myContext;

    public ListAdapter(List<ListElements> itemList, Context context) {
        this.misDatos = itemList;
        this.myInflater = LayoutInflater.from(context);
        this.myContext = context;
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = myInflater.inflate(R.layout.list_elements, null);
        return new ViewHolder(vista, myContext);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        holder.bindData(misDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return misDatos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView sender, subject, summary, senderIcon;
        Context context;

        public ViewHolder(@NonNull View itemView, Context context) {
            super(itemView);
            sender = itemView.findViewById(R.id.senderTextView);
            subject = itemView.findViewById(R.id.subjectTextView);
            summary = itemView.findViewById(R.id.summaryTextView);
            senderIcon = itemView.findViewById(R.id.senderIcon);
            this.context = context;

            // Agrega el onClickListener al itemView
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        // Obtiene el objeto ListElements de la posición en la que se hizo clic
                        ListElements clickedItem = misDatos.get(position);

                        // Iniciar la actividad de visualización de correo electrónico y pasar los datos
                        Intent intent = new Intent(context, viewMail.class);
                        intent.putExtra("sender", clickedItem.getSender());
                        intent.putExtra("subject", clickedItem.getSubject());
                        intent.putExtra("body", clickedItem.getMessageContent());
                        context.startActivity(intent);
                    }
                }
            });
        }

        void bindData(final ListElements item){
            sender.setText(item.getSender());
            subject.setText(item.getSubject());
            summary.setText(item.getSummary());
            senderIcon.setText(item.getSenderIcon());
        }
    }
}
