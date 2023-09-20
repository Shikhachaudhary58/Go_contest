package com.example.splashscreen.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.splashscreen.R;
import com.example.splashscreen.contest;

import java.util.List;

public class ContestAdapter extends RecyclerView.Adapter<ContestAdapter.viewHolder> {

    Context context;
    List<contest> items;

    public ContestAdapter(Context context, List<contest> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.contest1,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContestAdapter.viewHolder holder, int position) {
        holder.greetings.setText(items.get(position).getGreetings());
        holder.won.setText(items.get(position).getWon());
        holder.date.setText(items.get(position).getDate());
        holder.imageView.setImageResource(items.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public class viewHolder extends RecyclerView.ViewHolder{
        TextView greetings;
        TextView won;
        TextView date;
        ImageView imageView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            greetings = itemView.findViewById(R.id.text1);
            won = itemView.findViewById(R.id.text2);
            date = itemView.findViewById(R.id.text3);
            imageView = itemView.findViewById(R.id.img1);
        }
    }
}
