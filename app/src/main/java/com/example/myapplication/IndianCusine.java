package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class IndianCusine extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indiancusine);
        listview = (ListView) findViewById(R.id.indianlistview);
        List<String> list = new ArrayList<>();
        list.add("restaurant1");
        list.add("restaurant2");
        list.add("restaurant3");
        list.add("restaurant4");
        list.add("restaurant5");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listview.setAdapter(arrayAdapter);

    }
}
