package com.example.tvshows;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class Detail extends AppCompatActivity {

    TextView tvGenre;
    ImageView tvImage;
    TextView tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        tvGenre = (TextView)findViewById(R.id.txtGenre);
        tvImage = (ImageView)findViewById(R.id.ivImage2);
        tvDescription = (TextView)findViewById(R.id.txtDescription);

        Bundle mBundle = getIntent().getExtras();

        tvDescription.setText(mBundle.getString("Description"));
        if(mBundle!=null)
        {
            tvGenre.setText(mBundle.getString("Genre"));
            tvImage.setImageResource(mBundle.getInt("Image"));
        }
    }
}