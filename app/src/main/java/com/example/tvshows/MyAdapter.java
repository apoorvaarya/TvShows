package com.example.tvshows;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<TvViewHolder> {

    private Context mContext;
    private List<TvData> myTvList;


    public MyAdapter(Context mContext, List<TvData> myTvList) {
        this.mContext = mContext;
        this.myTvList = myTvList;
    }

    @NonNull
    @Override
    public TvViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_row_item, viewGroup, false);


        return new TvViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull final TvViewHolder tvViewHolder, int i) {
        tvViewHolder.imageView.setImageResource(myTvList.get(i).getItemImage());
        tvViewHolder.mTitle.setText(myTvList.get(i).getItemName());
        tvViewHolder.mGenre.setText(myTvList.get(i).getItemGenre());
        tvViewHolder.mRate.setText(myTvList.get(i).getItemRate());

        tvViewHolder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, Detail.class);
                intent.putExtra("Image", myTvList.get(tvViewHolder.getAdapterPosition()).getItemImage());
                intent.putExtra("Genre", myTvList.get(tvViewHolder.getAdapterPosition()).getItemGenre());
                mContext.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return myTvList.size();
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
