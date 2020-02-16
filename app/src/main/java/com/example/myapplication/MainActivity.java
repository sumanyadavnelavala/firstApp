package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewName,textViewID;
    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewName = findViewById(R.id.textViewName);
        textViewID = findViewById(R.id.textViewID);
        linearLayout = findViewById(R.id.linearLayout);
        textViewName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewID.setVisibility(View.VISIBLE);
                textViewID.setText("suman");
                textViewName.setText("Lavanya");
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewID.setVisibility(View.GONE);
                textViewName.setText("Hello World");
            }
        });        
    }
}
