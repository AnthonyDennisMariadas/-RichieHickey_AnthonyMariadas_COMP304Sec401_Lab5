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

public class IndianCusine extends AppCompatActivity {
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indiancusine);

        listview = (ListView) findViewById(R.id.indianLV);

        //retrieving contents from stringarray of indian restaurants
        String[] indianArray = getResources().getStringArray(R.array.indian_restaurants);
        //converting array to a list
        List<String> indianList = Arrays.asList(indianArray);
        //initializing an ArrayList that takes a key,value of restaurant,address
        List<Map<String,String>> restaurantdata = new ArrayList<>();

        //adding data of all the restaurants
        Map<String,String> res1 = new HashMap<>(2);
        res1.put("Restaurant",indianList.get(0));
        res1.put("Address","796 Bloor St W, Toronto ON, M6G1L7");
        restaurantdata.add(res1);

        Map<String,String> res2 = new HashMap<>(2);
        res2.put("Restaurant",indianList.get(1));
        res2.put("Address","3034 Dundas St W, Toronto ON, M6P 1Z3");
        restaurantdata.add(res2);

        Map<String,String> res3 = new HashMap<>(2);
        res3.put("Restaurant",indianList.get(2));
        res3.put("Address","255 Queen St W, Toronto ON, M5V 1Z4");
        restaurantdata.add(res3);

        SimpleAdapter adapter = new SimpleAdapter(this,restaurantdata,R.layout.list_content_twoline,
                new String[] {"Restaurant","Address"},
                new int[] {R.id.tv1,R.id.tv2});

        listview.setAdapter(adapter);

    }
}
