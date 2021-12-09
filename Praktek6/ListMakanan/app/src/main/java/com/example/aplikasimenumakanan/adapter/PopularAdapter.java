package com.example.aplikasimenumakanan.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.aplikasimenumakanan.Activity.ShowDetailActivity;
import com.example.aplikasimenumakanan.Domain.FoodDomain;
import com.example.aplikasimenumakanan.R;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder>{
    ArrayList<FoodDomain> foodDomain;

    public PopularAdapter(ArrayList<FoodDomain> FoodDomain) {
        this.foodDomain = FoodDomain;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_popular,parent,false);

        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(foodDomain.get(position).getTitle());
        holder.fee.setText((String.valueOf((foodDomain.get(position).getFee()))));
        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(foodDomain.get(position).getPic(),"drawable", holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.pic);

        holder.addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(holder.itemView.getContext(), ShowDetailActivity.class);
                Intent
            }
        });
    }


    @Override
    public int getItemCount() {
        return foodDomain.size();
    }
    public class ViewHolder extends  RecyclerView.ViewHolder{
        TextView title,fee;
        ImageView pic;
        ConstraintLayout addBtn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            fee=itemView.findViewById(R.id.fee);
            pic=itemView.findViewById(R.id.pic);
            addBtn=itemView.findViewById(R.id.addBtn);

        }
    }
}
