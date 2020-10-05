package com.example.tvshows;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    TextView tvGenre;
    ImageView tvImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvGenre = (TextView)findViewById(R.id.txtGenre);
        tvImage = (ImageView)findViewById(R.id.ivImage2);
    }
}