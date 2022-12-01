package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView cuisineLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cuisineLV = findViewById(R.id.cuisineListview);

        String[] cuisineArray = getResources().getStringArray(R.array.cuisine_types);
        List<String> cuisineList = Arrays.asList(cuisineArray);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.list_content,R.id.list_content_tv,cuisineList);

        cuisineLV.setAdapter(adapter);
        cuisineLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s = cuisineLV.getItemAtPosition(i).toString();
                switch(s)
                {
                    case "Chinese":
                        Toast.makeText(MainActivity.this,"You have chosen " + s,Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(MainActivity.this,ChineseCusine.class);
                        startActivity(intent1);
                        break;
                    case "Indian":
                        Toast.makeText(MainActivity.this,"You have chosen " + s,Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(MainActivity.this,IndianCusine.class);
                        startActivity(intent2);
                        break;
                    case "Italian":
                        Toast.makeText(MainActivity.this,"You have chosen " + s,Toast.LENGTH_SHORT).show();
                        Intent intent3 = new Intent(MainActivity.this,ItalianCusine.class);
                        startActivity(intent3);
                        break;
                    case "Greek":
                        Toast.makeText(MainActivity.this,"You have chosen " + s,Toast.LENGTH_SHORT).show();
                        Intent intent4 = new Intent(MainActivity.this,GreekCuisine.class);
                        startActivity(intent4);
                        break;
                }
            }
        });

    }
}