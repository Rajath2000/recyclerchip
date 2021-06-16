package com.example.recyclerchip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    RecyclerView rcv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        rcv=(RecyclerView) findViewById(R.id.relview);
//        rcv.setLayoutManager(new LinearLayoutManager(this));
//        String arr[]={"cat","rat","bat","areca"};
//        rcv.setAdapter(new myadapter(arr));



        getSupportFragmentManager().beginTransaction().replace(R.id.maincontainer,new DataFragment()).commit();


    }
}