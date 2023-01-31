package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Produktiv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produktiv);

        LinearLayout buttonProfil = (LinearLayout) findViewById(R.id.buttonProfil);
        buttonProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Produktiv.this,MainActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout buttonTodo = (LinearLayout) findViewById(R.id.buttonTodo);
        buttonTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Produktiv.this,Todo.class);
                startActivity(intent);
            }
        });
    }
}