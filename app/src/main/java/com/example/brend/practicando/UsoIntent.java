package com.example.brend.practicando;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UsoIntent extends AppCompatActivity {
    private Button mllama;
    private Button mCamara;
    private Button mNavega;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uso_intent);

        mllama = findViewById(R.id.intent_llama);
        mCamara = findViewById(R.id.intent_camara);
        mNavega = findViewById(R.id.intent_navega);

        mllama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri numero = Uri.parse("tel:7362833");
                Intent i = new Intent(Intent.ACTION_CALL, numero);
                startActivity(i);
            }
        });

        mCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(i);
            }
        });

        mNavega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri navegador = Uri.parse("http://www.google.com/");
                Intent i = new Intent(Intent.ACTION_VIEW, navegador);
                startActivity(i);
            }
        });
    }
}
