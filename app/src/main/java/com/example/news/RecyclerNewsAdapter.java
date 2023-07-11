package com.example.news;

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

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerNewsAdapter extends RecyclerView.Adapter<RecyclerNewsAdapter.ViewHolder>
{

    Context context;
    ArrayList<SecModelClass>  modelClassArrayList ;


    public RecyclerNewsAdapter(Context context, ArrayList<SecModelClass> modelClassArrayList) {
        this.context = context;
        this.modelClassArrayList = modelClassArrayList;
    }

    @NonNull
    @Override
    public RecyclerNewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.news_item,null,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerNewsAdapter.ViewHolder holder,int position)
    {
        holder.mnewscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent(context,webView.class);
                intent.putExtra("url",modelClassArrayList.get(position).getUrl());
                context.startActivity(intent);
            }
        });

        holder.mnewsauthor.setText(modelClassArrayList.get(position).getAuthor());
        holder.mnewsheading.setText(modelClassArrayList.get(position).getTitle());
        holder.mnewsdesc.setText(modelClassArrayList.get(position).getDescription());
        Glide.with(context).load(modelClassArrayList.get(position).getUrlToImage()).into(holder.mnewsimg);



    }

    @Override
    public int getItemCount() {
        return modelClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

         ImageView mnewsimg;
         CardView mnewscard;
         TextView mnewsheading ,mnewsdesc,mnewsauthor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mnewsheading = itemView.findViewById(R.id.newsheading);
            mnewsdesc = itemView.findViewById(R.id.newsdesc);
            mnewsauthor = itemView.findViewById(R.id.newsauthor);
            mnewsimg = itemView.findViewById(R.id.newsimage);
            mnewscard = itemView.findViewById(R.id.newscard);
        }
    }
}
