package com.example.brend.practicando;

import android.app.Activity;
import android.content.Context;
import android.location.OnNmeaMessageListener;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment1 extends Fragment {

    private EditText mNameEditText;
    private Button mSendButton;
    OnMessageReadListener messageReadListener;

    public interface OnMessageReadListener{
        public void onMessageRead(String message);
    }

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        // Inflate the layout for this fragment
        mNameEditText = view.findViewById(R.id.editText2);
        mSendButton=view.findViewById(R.id.button2);
        mSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = mNameEditText.getText().toString();
                messageReadListener.onMessageRead(message);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        Activity activity=(Activity)context;
        try {
            messageReadListener=(OnMessageReadListener)activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString()+" debes de sobreescribir onMessageRead...");
        }
    }

}
