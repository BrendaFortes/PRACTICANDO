package com.example.brend.practicando;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextoFragm extends AppCompatActivity implements Fragment1.OnMessageReadListener{
    private TextView mMessageTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto_fragm);
        if(findViewById(R.id.fragment_crear_mensaje)!=null){
            if(savedInstanceState!=null){
                return;
            }
        }
    }

    public void onMessageRead(String message){
        mMessageTextView=findViewById(R.id.txt_display_message);
        mMessageTextView.setText(message);
    }
}
