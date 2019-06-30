package com.example.brend.practicando;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OtroTextoAct extends AppCompatActivity {
    private Button mBotonEnviarOtro2;
    private TextView mTextoRecibido2;

    //envio inicio...
    private EditText mEnviarTexto2;
    private Button mBotonEnviarTexto2;
    //...fin

    //Recibir inicio...
    private static final String SEND_MESSAGE="message";
    public static Intent newIntent(Context context, String message){
        Intent i=new Intent(context,OtroTextoAct.class);
        i.putExtra(SEND_MESSAGE,message);
        return i;
    }
    //... fin

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otro_texto);

        mEnviarTexto2 = findViewById(R.id.texto_env2);
        mBotonEnviarTexto2 = findViewById(R.id.btn_enviar2);
        mTextoRecibido2 = findViewById(R.id.texto_recibido2);

        //Recibir inicio...
        String message=getIntent().getStringExtra(SEND_MESSAGE);
        mTextoRecibido2.setText(message);
        //...fin

        //definicion
        mBotonEnviarTexto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoRe2 = mEnviarTexto2.getText().toString();
                mTextoRecibido2.setText(textoRe2);
            }
        });


        mBotonEnviarOtro2 = findViewById(R.id.btn_a);
        mBotonEnviarOtro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoRe2 = mEnviarTexto2.getText().toString();
                Intent i=TextoAct.newIntent2(OtroTextoAct.this,textoRe2);
                startActivityForResult(i,0);
            }
        });
    }
}
