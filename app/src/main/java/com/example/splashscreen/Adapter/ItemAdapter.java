package com.example.splashscreen.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.splashscreen.Data;
import com.example.splashscreen.R;
import com.example.splashscreen.contest_details;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.itemAdapter>{


    private List<Data> list;

    public ItemAdapter(List<Data> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public itemAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new itemAdapter(LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull itemAdapter holder, int position) {
        final Data mydataList = list.get(position);
        holder.textques.setText(mydataList.getQues());
        holder.textplay.setText(mydataList.getPlay());
        holder.textfees.setText(mydataList.getFees());
        holder.time.setText(mydataList.getTime());
        holder.user.setText(mydataList.getUsers());
        holder.imageview.setImageResource(mydataList.getImage());
        holder.joinnow.setOnClickListener(view -> {
            // Handle the click event here
            Context context = holder.itemView.getContext();
            Intent intent = new Intent(context, contest_details.class); // Replace ContestDetailsActivity with the desired activity
            // If you need to pass any data to the ContestDetailsActivity, you can do it here using intent extras.
            intent.putExtra("contestId", mydataList.getJoinnow()); // Example: Passing the contestId as an extra
            context.startActivity(intent);
        });

    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class itemAdapter extends RecyclerView.ViewHolder{
        ImageView imageview;
        TextView textques;
        TextView textplay;
        TextView textfees;
        TextView time;
        TextView user;
        Button joinnow;

        public itemAdapter(@NonNull View itemView) {
            super(itemView);
            imageview = itemView.findViewById(R.id.img1);
            textques = itemView.findViewById(R.id.text1);
            textplay = itemView.findViewById(R.id.text2);
            textfees = itemView.findViewById(R.id.text3);
            time = itemView.findViewById(R.id.txt4);
            user = itemView.findViewById(R.id.txt5);
            joinnow = itemView.findViewById(R.id.button);
        }
    }
}
