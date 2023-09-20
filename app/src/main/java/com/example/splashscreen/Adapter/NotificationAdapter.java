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
import com.example.splashscreen.notification1;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.viewHolder> {
    Context context;
    List<notification1> items;

    public NotificationAdapter(Context context, List<notification1> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NotificationAdapter.viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.play.setText(items.get(position).getPlay());
        holder.time.setText(items.get(position).getTime());
        holder.time.setText(items.get(position).getText());
        holder.image.setImageResource(items.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView play;
        TextView time;
        TextView text;
        ImageView image;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            play = itemView.findViewById(R.id.textView);
            time = itemView.findViewById(R.id.txtview1);
            text = itemView.findViewById(R.id.txtview2);
            image = itemView.findViewById(R.id.image2);
        }
    }
}
