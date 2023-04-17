package com.alexander.appmail;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElements> elements;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void  init(){
        elements = new ArrayList<>();
        elements.add(new ListElements("peraltalondonoalex@gmail.com","Bienvenida","Le damos la cordial bienvenida a por medio de este email","Cordial bienvenida","P"));
        elements.add(new ListElements("maria@example.com","Invitación a la fiesta","Te invitamos a nuestra fiesta de cumpleaños","¡Ven y diviértete!","P"));
        elements.add(new ListElements("juan@example.com","Oferta de trabajo","Estamos buscando un programador con experiencia en Java","¡Únete a nuestro equipo!","T"));
        elements.add(new ListElements("ana@example.com","Recordatorio de pago","Te recordamos que debes hacer el pago de tu factura antes del 30 de abril","Por favor, mantén tus cuentas al día","I"));
        elements.add(new ListElements("pedro@example.com","Confirmación de reserva","Tu reserva para el hotel XYZ ha sido confirmada","¡Disfruta de tus vacaciones!","P"));
        elements.add(new ListElements("carla@example.com","Notificación de entrega","Tu paquete ha sido entregado en la dirección indicada","Esperamos que disfrutes de tu compra","I"));
        elements.add(new ListElements("luis@example.com","Actualización de software","La versión 2.0 de nuestro software ya está disponible","Actualiza para disfrutar de nuevas funcionalidades","T"));
        elements.add(new ListElements("jose@example.com","Cambio de política de privacidad","Hemos actualizado nuestra política de privacidad para cumplir con nuevas regulaciones","Por favor, léela cuidadosamente","I"));
        elements.add(new ListElements("diana@example.com","Recordatorio de cita médica","Te recordamos que tienes una cita médica el próximo martes a las 10am","Por favor, confirma tu asistencia","P"));
        elements.add(new ListElements("javier@example.com","Agradecimiento por donación","Agradecemos tu donación para nuestra organización","Tus contribuciones hacen la diferencia","P"));
        elements.add(new ListElements("camila@example.com","Promoción de descuento","Solo por hoy, obtén un 20% de descuento en todos nuestros productos","Aprovecha esta oportunidad","T"));

        ListAdapter listAdapter = new ListAdapter(elements,this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

}