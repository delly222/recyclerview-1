package com.bayufajariyanto.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView view;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataSet = new ArrayList<>();
        initDataset();

        view = (RecyclerView) findViewById(R.id.rv_main);
        view.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        view.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(this, dataSet);
        view.setAdapter(adapter);
    }

    private void initDataset() {
        dataSet.add("Bayu");
        dataSet.add("Delly");
        dataSet.add("Zul");
        dataSet.add("Dhimas");
        dataSet.add("Rifai");

    }


}
