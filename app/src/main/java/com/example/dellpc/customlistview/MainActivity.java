package com.example.dellpc.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.dellpc.customlistview.R.layout.activity_custom_list;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<CustomData> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.list);

        CustomData cd0 = new CustomData("Harsh Bansal","9261606101");arrayList.add(cd0);
        CustomData cd1 = new CustomData("Jay Mulani","9261606101");arrayList.add(cd1);
        CustomData cd2 = new CustomData("Piyush Adwani","9261606101");arrayList.add(cd2);
        CustomData cd3 = new CustomData("Prateek Jindal","9261606101");arrayList.add(cd3);

        CustomAdapter customAdapter = new CustomAdapter(arrayList,this, activity_custom_list);
        lv = findViewById(R.id.list);
         lv.setAdapter(customAdapter);



    }
}
