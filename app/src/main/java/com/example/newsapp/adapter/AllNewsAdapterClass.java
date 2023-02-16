package com.example.newsapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.newsapp.R;
import com.example.newsapp.databinding.AllnewaadapterBinding;
import com.example.newsapp.modalClass.News;

import java.util.List;

public class AllNewsAdapterClass extends RecyclerView.Adapter<AllNewsAdapterClass.OrderViewHolder> {

    private Context context;
    private List<News> newsList;
    public AllNewsAdapterClass(List<News> newsList, Context context) {
        this.newsList = newsList;
        this.context = context;
    }
    @NonNull
    @Override
    public AllNewsAdapterClass.OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View order = LayoutInflater.from(parent.getContext()).inflate(R.layout.allnewaadapter, parent, false);
        AllNewsAdapterClass.OrderViewHolder orderViewHolder = new AllNewsAdapterClass.OrderViewHolder(order);
        return orderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AllNewsAdapterClass.OrderViewHolder holder, int position) {

        holder.binding.playerName.setText(newsList.get(position).getPname());
        holder.binding.playerPosition.setText(newsList.get(position).getPosition());
        holder.binding.playerTime.setText(newsList.get(position).getTime());
        holder.binding.title.setText(newsList.get(position).getTitle());
        holder.binding.details.setText(newsList.get(position).getDetails());
        Glide.with(context).load(newsList.get(position).getPlayerImageUrl()).into(holder.binding.playerImage);


    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }


    public class OrderViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        AllnewaadapterBinding binding ;

        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
           // if (clickListener != null) clickListener.onClick(view, getAdapterPosition());
        }
    }

//    public interface ItemClickListener {
//        void onClick(View view, int position);
//    }

}
