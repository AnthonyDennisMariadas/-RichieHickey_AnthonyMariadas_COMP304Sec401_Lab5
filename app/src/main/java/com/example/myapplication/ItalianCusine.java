package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        listview3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s = italianList.get(i);

                switch (s)
                {
                    case "Taverna Mercatto":
                        Intent intent1 = new Intent(ItalianCusine.this,MapsActivity.class);
                        intent1.putExtra("lat",43.6431197);
                        intent1.putExtra("lng",-79.3830406);
                        intent1.putExtra("title","Taverna Mercatto");
                        startActivity(intent1);
                        break;
                    case "Donatello Restaurant":
                        Intent intent2 = new Intent(ItalianCusine.this,MapsActivity.class);
                        intent2.putExtra("lat",43.6573448);
                        intent2.putExtra("lng",-79.3835733);
                        intent2.putExtra("title","Donatello Restaurant");
                        startActivity(intent2);
                        break;

                    case "Piano Piano Restaurant":
                        Intent intent3 = new Intent(ItalianCusine.this,MapsActivity.class);
                        intent3.putExtra("lat",43.6630374);
                        intent3.putExtra("lng",-79.4029297);
                        intent3.putExtra("title","Piano Piano Restaurant");
                        startActivity(intent3);
                        break;

                    case "Terroni":
                        Intent intent4 = new Intent(ItalianCusine.this,MapsActivity.class);
                        intent4.putExtra("lat",43.6509141);
                        intent4.putExtra("lng",-79.375752);
                        intent4.putExtra("title","Terroni");
                        startActivity(intent4);
                        break;
                }
            }
        });
    }
}