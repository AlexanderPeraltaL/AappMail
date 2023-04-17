package com.alexander.appmail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class viewMail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_mail);

        Intent intent = getIntent();
        String sender = intent.getStringExtra("sender");
        String subject = intent.getStringExtra("subject");
        String body = intent.getStringExtra("body");

        TextView senderTextView = findViewById(R.id.senderTextView);
        TextView subjectTextView = findViewById(R.id.subjectTextView);
        TextView bodyTextView = findViewById(R.id.bodyTextView);

        senderTextView.setText(sender);
        subjectTextView.setText(subject);
        bodyTextView.setText(body);


        Button volverButton = findViewById(R.id.btn_volver);
        volverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(viewMail.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}