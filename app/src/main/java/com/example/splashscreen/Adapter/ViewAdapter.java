package com.example.splashscreen.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.splashscreen.R;
import com.example.splashscreen.deposite;

import java.util.List;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.depositAdapter> {
    Context context;
    List<deposite> items;

    public ViewAdapter(List<deposite> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewAdapter.depositAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewAdapter.depositAdapter(LayoutInflater.from(parent.getContext()).inflate(R.layout.diposit,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewAdapter.depositAdapter holder, int position) {
        holder.diposit.setText(items.get(position).getDiposit());
        holder.time.setText(items.get(position).getTime());
        holder.date.setText(items.get(position).getDate());
        holder.rs.setText(items.get(position).getRs());
        holder.status.setText(items.get(position).getStatus());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public class depositAdapter extends RecyclerView.ViewHolder{
        TextView diposit;
        TextView time;
        TextView date;
        TextView rs;
        TextView status;

        public depositAdapter(@NonNull View itemView) {
            super(itemView);
            diposit = itemView.findViewById(R.id.deposite);
            time = itemView.findViewById(R.id.deposite1);
            date = itemView.findViewById(R.id.d2);
            rs = itemView.findViewById(R.id.d3);
            status = itemView.findViewById(R.id.d4);
        }
    }
}
