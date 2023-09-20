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
import com.example.splashscreen.Style;

import java.util.List;

public class StyleAdapter extends RecyclerView.Adapter<StyleAdapter.styleAdapter> {
    List<Style> data;
    Context context;

    public StyleAdapter(List<Style> data) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public StyleAdapter.styleAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StyleAdapter.styleAdapter(LayoutInflater.from(parent.getContext()).inflate(R.layout.home1,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StyleAdapter.styleAdapter holder, int position) {
        holder.name.setText(data.get(position).getName());
        holder.rank.setText(data.get(position).getRank());
        holder.rs.setText(data.get(position).getRs());
        holder.imageView.setImageResource(data.get(position).getImage());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public class styleAdapter extends RecyclerView.ViewHolder{
        TextView name;
        TextView rank;
        TextView rs;
        ImageView imageView;

        public styleAdapter(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            rank = itemView.findViewById(R.id.rank);
            rs = itemView.findViewById(R.id.rupee1);
            imageView = itemView.findViewById(R.id.trace);
        }
    }
}
