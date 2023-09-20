package com.example.splashscreen.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.splashscreen.R;
import com.example.splashscreen.play;

import java.util.List;

public class Play_Adapter extends RecyclerView.Adapter<Play_Adapter.playAdapter> {
    List<play> data;
    Context context;

    public Play_Adapter(List<play> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public Play_Adapter.playAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new playAdapter(LayoutInflater.from(parent.getContext()).inflate(R.layout.play,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Play_Adapter.playAdapter holder, int position) {
        holder.text.setText(data.get(position).getText());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public class playAdapter extends RecyclerView.ViewHolder{
        TextView text;

        public playAdapter(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.play_text);
        }
    }
}
