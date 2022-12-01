package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItalianCusine extends AppCompatActivity {
    ListView listview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_cusine);
        listview3 = (ListView) findViewById(R.id.italianlistview);
        //retrieving our string array from strings.xml
        String[] italianArray = getResources().getStringArray(R.array.italian_restaurants);
        //converting the array to a list
        List<String> italianList = Arrays.asList(italianArray);

        //initializing an ArrayList of restaurant,address
        List<Map<String,String>> restaurantData = new ArrayList<Map<String,String>>();

        //adding all of the restaurant data
        Map<String,String> res1 = new HashMap<String,String>(2);
        res1.put("Restaurant",italianList.get(0));
        res1.put("Address","120 Bremner Blvd, Toronto ON, M5J3A6");
        restaurantData.add(res1);

        Map<String,String> res2 = new HashMap<String,String>(2);
        res2.put("Restaurant",italianList.get(1));
        res2.put("Address","37 Elm St, Toronto ON, M5G 1H1");
        restaurantData.add(res2);

        Map<String,String> res3 = new HashMap<String,String>(2);
        res3.put("Restaurant",italianList.get(2));
        res3.put("Address","88 Harbord St, Toronto ON, M5S 1G5");
        restaurantData.add(res3);

        Map<String,String> res4 = new HashMap<String,String>(2);
        res4.put("Restaurant",italianList.get(3));
        res4.put("Address","57 Adelaide St E, Toronto ON, M5C 1K6");
        restaurantData.add(res4);


        SimpleAdapter adapter = new SimpleAdapter(this,restaurantData,R.layout.list_content_twoline,
                new String[] {"Restaurant","Address"},
                new int[] {R.id.tv1,R.id.tv2});
        listview3.setAdapter(adapter);
    }
}