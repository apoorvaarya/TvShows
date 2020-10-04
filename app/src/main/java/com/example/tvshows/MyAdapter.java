package com.example.tvshows;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<TvViewHolder> {



    @NonNull
    @Override
    public TvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull TvViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

class TvViewHolder extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView mTitle, mGenre, mRate;
    CardView mCardView;


    public TvViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.ivImage);
        mTitle = itemView.findViewById(R.id.tvTitle);
        mGenre = itemView.findViewById(R.id.tvGenre);
        mRate = itemView.findViewById(R.id.tvRate);

        mCardView = itemView.findViewById(R.id.myCardView);

    }
}
