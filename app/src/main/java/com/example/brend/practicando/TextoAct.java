package com.example.brend.practicando;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TextoAct extends AppCompatActivity {
    //declaracion de variables
    private Button mBotonEnviarOtro;
    private TextView mTextoRecibido1;

    //envio inicio ...
    private EditText mEnviarTexto1;
    private Button mBotonEnviarTexto1;
    //...fin

    //Recibir inicio...
    private static final String SEND_MESSAGE="message";
    public static Intent newIntent2(Context context, String message){
        Intent i=new Intent(context,OtroTextoAct.class);
        i.putExtra(SEND_MESSAGE,message);
        return i;
    }
    //... fin

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto);

        //inflamos las variables a su respectivo componente
        mEnviarTexto1 = findViewById(R.id.texto_env1);
        mBotonEnviarTexto1 = findViewById(R.id.btn_enviar1);
        mTextoRecibido1 = findViewById(R.id.texto_recibido1);

        //Recibir inicio...
        String message=getIntent().getStringExtra(SEND_MESSAGE);
        mTextoRecibido1.setText(message);
        //...fin

        //definimos el textview a lo que se se escribio en el edittext
        mBotonEnviarTexto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoRe = mEnviarTexto1.getText().toString();
                mTextoRecibido1.setText(textoRe);
            }
        });

        //Nos lleva a la otra actividad
        mBotonEnviarOtro = findViewById(R.id.btn_a_otro);
        mBotonEnviarOtro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Envio inicio...
                String textoRe = mEnviarTexto1.getText().toString();
                Intent i=OtroTextoAct.newIntent(TextoAct.this,textoRe);
                //...fin
                startActivityForResult(i,0);
            }
        });
    }
}
