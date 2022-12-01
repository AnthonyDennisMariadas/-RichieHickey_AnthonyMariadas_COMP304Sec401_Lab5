package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ChineseCusine extends AppCompatActivity {
    ListView listview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_cusine2);
        listview2 = (ListView) findViewById(R.id.chineselistview);
        List<String> list = new ArrayList<>();
        list.add("restaurant1");
        list.add("restaurant2");
        list.add("restaurant3");
        list.add("restaurant4");
        list.add("restaurant5");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listview2.setAdapter(arrayAdapter);
    }
}