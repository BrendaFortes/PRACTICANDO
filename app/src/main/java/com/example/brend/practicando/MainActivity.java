package com.example.brend.practicando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //BOTON INTENT
    private Button mButtonUsoIntent;

    //BOTON TEXTO ACT
    private Button mButtonTextoAct;

    //BOTON TEXTO FRAG
    private Button mButtonTextoFragm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BOTON INTENT
        mButtonUsoIntent = findViewById(R.id.button_usointent);
        mButtonUsoIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,UsoIntent.class);
                startActivityForResult(i,0);
            }
        });

        //BOTON TEXTO ACT
        mButtonTextoAct = findViewById(R.id.button_enviartexto_act);
        mButtonTextoAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,TextoAct.class);
                startActivityForResult(i,0);
            }
        });

        //BOTON TEXTO FRAGM
        mButtonTextoFragm = findViewById(R.id.button_enviartexto_frag);
        mButtonTextoFragm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,TextoFragm.class);
                startActivityForResult(i,0);
            }
        });
    }
}
