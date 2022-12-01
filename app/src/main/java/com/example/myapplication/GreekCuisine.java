package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GreekCuisine extends AppCompatActivity {
    ListView greekLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greek_cuisine);
        greekLV = findViewById(R.id.greekLView);

        //retrieving our string array from strings.xml
        String[] greekArray = getResources().getStringArray(R.array.greek_restaurants);
        //converting the array to a list
        List<String> greekList = Arrays.asList(greekArray);

        //initializing an ArrayList of restaurant,address
        List<Map<String,String>> restaurantData = new ArrayList<Map<String,String>>();

        //adding all of the restaurant data
        Map<String,String> res1 = new HashMap<String,String>(2);
        res1.put("Restaurant",greekList.get(0));
        res1.put("Address","133 Richmond St W, Toronto ON, M5H2L3");
        restaurantData.add(res1);

        Map<String,String> res2 = new HashMap<String,String>(2);
        res2.put("Restaurant",greekList.get(1));
        res2.put("Address","522 King St W, Toronto ON, M5V1L7");
        restaurantData.add(res2);

        Map<String,String> res3 = new HashMap<String,String>(2);
        res3.put("Restaurant",greekList.get(2));
        res3.put("Address","456 Danforth Ave, Toronto ON, M4K1P3");
        restaurantData.add(res3);

        Map<String,String> res4 = new HashMap<String,String>(2);
        res4.put("Restaurant",greekList.get(3));
        res4.put("Address","407 Danforth Ave, Toronto On, M4K1P1");
        restaurantData.add(res4);


        SimpleAdapter adapter = new SimpleAdapter(this,restaurantData,R.layout.list_content_twoline,
                new String[] {"Restaurant","Address"},
                new int[] {R.id.tv1,R.id.tv2});
        greekLV.setAdapter(adapter);

        greekLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s = greekList.get(i);
                switch(s)
                {
                    case "Volos Greek Cuisine":
                        Intent intent1 = new Intent(GreekCuisine.this,MapsActivity.class);
                        intent1.putExtra("lat",43.650317);
                        intent1.putExtra("lng",-79.3847681);
                        intent1.putExtra("title","Volos Greek Cuisine");
                        startActivity(intent1);
                        break;
                    case "Myth":
                        Intent intent2 = new Intent(GreekCuisine.this,MapsActivity.class);
                        intent2.putExtra("lat",43.6452506);
                        intent2.putExtra("lng",-79.3974541);
                        intent2.putExtra("title","Myth");
                        startActivity(intent2);
                        break;

                    case "Mezes":
                        Intent intent3 = new Intent(GreekCuisine.this,MapsActivity.class);
                        intent3.putExtra("lat",43.6780626);
                        intent3.putExtra("lng",-79.3503342);
                        intent3.putExtra("title","Mezes");
                        startActivity(intent3);
                        break;

                    case "Pantheon Restaurant":
                        Intent intent4 = new Intent(GreekCuisine.this,MapsActivity.class);
                        intent4.putExtra("lat",43.6775287);
                        intent4.putExtra("lng",-79.3513084);
                        intent4.putExtra("title","Pantheon Restaurant");
                        startActivity(intent4);
                        break;
                }
            }
        });




    }
}