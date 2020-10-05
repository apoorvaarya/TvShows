package com.example.tvshows;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<TvData> myTvList;
    TvData mTvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myTvList = new ArrayList<>();

        mTvData = new TvData("Brooklyn nine-nine", "Comedy", "10/10", R.drawable.tvimage1);
        myTvList.add(mTvData);

        mTvData = new TvData("Grey's Anatomy", "Drama", "8/10", R.drawable.tvimage2);
        myTvList.add(mTvData);

        mTvData = new TvData("The Flash", "Sci-Fi", "8.5/10", R.drawable.tvimage3);
        myTvList.add(mTvData);

        mTvData = new TvData("Supernatural", "Horror", "9/10", R.drawable.tvimage4);
        myTvList.add(mTvData);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, myTvList);
        mRecyclerView.setAdapter(myAdapter);
    }
}