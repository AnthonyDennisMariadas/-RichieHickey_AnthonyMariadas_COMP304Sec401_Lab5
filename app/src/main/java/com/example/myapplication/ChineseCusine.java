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

public class ChineseCusine extends AppCompatActivity {
    ListView listview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_cusine2);

        listview2 = (ListView) findViewById(R.id.chineselistview);

        //retrieving our string array from strings.xml
        String[] chineseArray = getResources().getStringArray(R.array.chinese_restaurants);
        //converting the array to a list
        List<String> chineseList = Arrays.asList(chineseArray);

        //initializing an ArrayList of restaurant,address
        List<Map<String,String>> restaurantData = new ArrayList<Map<String,String>>();

        //adding all of the restaurant data
        Map<String,String> res1 = new HashMap<String,String>(2);
        res1.put("Restaurant",chineseList.get(0));
        res1.put("Address","813 Yonge St, Toronto ON, M4W2G8");
        restaurantData.add(res1);

        Map<String,String> res2 = new HashMap<String,String>(2);
        res2.put("Restaurant",chineseList.get(1));
        res2.put("Address","747 Don Mills Rd, North York ON, M3C1T2");
        restaurantData.add(res2);

        Map<String,String> res3 = new HashMap<String,String>(2);
        res3.put("Restaurant",chineseList.get(2));
        res3.put("Address","484 Dundas St W., Toronto ON, M5T1G9");
        restaurantData.add(res3);

        Map<String,String> res4 = new HashMap<String,String>(2);
        res4.put("Restaurant",chineseList.get(3));
        res4.put("Address","2993 Bloor St W., Etobicoke ON, M8X1C1");
        restaurantData.add(res4);


        SimpleAdapter adapter = new SimpleAdapter(this,restaurantData,R.layout.list_content_twoline,
                new String[] {"Restaurant","Address"},
                new int[] {R.id.tv1,R.id.tv2});
        listview2.setAdapter(adapter);

        listview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s = chineseList.get(i);
                switch(s)
                {
                    case "Lee Chen Asian Bistro":
                        Intent intent1 = new Intent(ChineseCusine.this,MapsActivity.class);
                        intent1.putExtra("lat",43.6723835);
                        intent1.putExtra("lng",-79.3874595);
                        intent1.putExtra("title","Lee Chen Asian Bistro");
                        startActivity(intent1);
                        break;
                    case "Mulan Chinese Cuisine":
                        Intent intent2 = new Intent(ChineseCusine.this,MapsActivity.class);
                        intent2.putExtra("lat",43.7141178);
                        intent2.putExtra("lng",-79.3339457);
                        intent2.putExtra("title","Mulan Chinese Cuisine");
                        startActivity(intent2);
                        break;

                    case "House of Gourmet":
                        Intent intent3 = new Intent(ChineseCusine.this,MapsActivity.class);
                        intent3.putExtra("lat",43.6532071);
                        intent3.putExtra("lng",-79.3973086);
                        intent3.putExtra("title","House of Gourmet");
                        startActivity(intent3);
                        break;

                    case "Hong Kong Gardens":
                        Intent intent4 = new Intent(ChineseCusine.this,MapsActivity.class);
                        intent4.putExtra("lat",43.647535);
                        intent4.putExtra("lng",-79.5099386);
                        intent4.putExtra("title","Hong Kong Gardens");
                        startActivity(intent4);
                        break;
                }
            }
        });
    }
}