package com.example.splashscreen.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.splashscreen.R;

public class frqadapter extends RecyclerView.Adapter<frqadapter.TournamentViewHolder> {
private int mPosition = -1;
private boolean isClick = true;

public static class TournamentViewHolder extends RecyclerView.ViewHolder {
    ImageView arrowForwardIos24;
    TextView answer;

    public TournamentViewHolder(View itemView) {
        super(itemView);
        arrowForwardIos24 = itemView.findViewById(R.id.arrow_forward_ios_24); // Replace with actual resource ID
        answer = itemView.findViewById(R.id.answer); // Replace with actual resource ID
    }
}

    @Override
    public TournamentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.extend, parent, false); // Replace with actual layout resource
        return new TournamentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull frqadapter.TournamentViewHolder holder, int position) {
        holder.arrowForwardIos24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int visibility = holder.answer.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE;
                float rotation = visibility == View.VISIBLE ? -90f : 90f;
                holder.answer.setVisibility(visibility);
                holder.arrowForwardIos24.setRotation(rotation);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 20;
    }

}
