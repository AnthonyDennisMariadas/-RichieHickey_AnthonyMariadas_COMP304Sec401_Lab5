package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button indBtn, chiBtn, itaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        indBtn = findViewById(R.id.button2);
        chiBtn = findViewById(R.id.button3);
        itaBtn = findViewById(R.id.button4);

        indBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,IndianCusine.class);
                startActivity(intent);
            }
        });

        chiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ChineseCusine.class);
                startActivity(intent);
            }
        });


        itaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ItalianCusine.class);
                startActivity(intent);
            }
        });





    }
}