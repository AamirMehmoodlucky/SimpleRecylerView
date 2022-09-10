package com.supportivehands.testproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with

        ArrayList<String> list=new ArrayList<>();
        list.add("Abbottabad");
        list.add("huripur");
        list.add("mansehra");
        list.add("lahore");
        list.add("karachi");
        list.add("rawlpindi");
        list.add("havelian");
        list.add("post graduate");
        list.add("mezail chowk");
        list.add("nawa sher");
        list.add("kpk");
        list.add("supply");
        list.add("Abbottabad");
        list.add("huripur");
        list.add("mansehra");
        list.add("lahore");
        list.add("karachi");
        list.add("rawlpindi");
        list.add("havelian");
        list.add("post graduate");
        list.add("mezail chowk");
        list.add("nawa sher");
        list.add("kpk");
        list.add("supply");

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, list);
        recyclerView.setAdapter(adapter);
    }
}