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

        mTvData = new TvData("Brooklyn nine-nine", "Comedy", "10/10", "Brooklyn Nine-Nine is an American police procedural comedy television series created by Dan Goor and Michael Schur. The series revolves around Jake Peralta (Andy Samberg), an immature but talented NYPD detective in Brooklyn's fictional 99th Precinct, who often comes into conflict with his new commanding officer, the serious and stern Captain Raymond Holt (Andre Braugher). The rest of the cast features Stephanie Beatriz as Rosa Diaz, Terry Crews as Terry Jeffords, Melissa Fumero as Amy Santiago, Joe Lo Truglio as Charles Boyle, Chelsea Peretti as Gina Linetti, Dirk Blocker as Michael Hitchcock, and Joel McKinnon Miller as Norm Scully.", R.drawable.tvimage1);
        myTvList.add(mTvData);

        mTvData = new TvData("Grey's Anatomy", "Drama", "8/10", "Grey's Anatomy is an American medical drama television series that premiered on March 27, 2005, on the American Broadcasting Company (ABC) as a mid-season replacement. The fictional series focuses on the lives of surgical interns, residents, and attendings as they develop into seasoned doctors while balancing personal and professional relationships.", R.drawable.tvimage2);
        myTvList.add(mTvData);

        mTvData = new TvData("The Flash", "Sci-Fi", "8.5/10", "The Flash is an American superhero television series developed by Greg Berlanti, Andrew Kreisberg, and Geoff Johns, airing on The CW. It is based on the Barry Allen incarnation of DC Comics character the Flash, a costumed superhero crime-fighter with the power to move at superhuman speeds.", R.drawable.tvimage3);
        myTvList.add(mTvData);

        mTvData = new TvData("Supernatural", "Horror", "9/10", "Supernatural is an American television series created by Eric Kripke. It was first broadcast on September 13, 2005, on The WB, and subsequently became part of successor The CW's lineup. Starring Jared Padalecki as Sam Winchester and Jensen Ackles as Dean Winchester, the series follows the two brothers as they hunt demons, ghosts, monsters, and other supernatural beings.", R.drawable.tvimage4);
        myTvList.add(mTvData);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, myTvList);
        mRecyclerView.setAdapter(myAdapter);
    }
}