package com.example.splashscreen.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.splashscreen.R;
import com.example.splashscreen.itemtournament;

import java.util.List;

public class ExpandableRecyclerviewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int VIEW_TYPE_GROUP = 1;
    private static final int VIEW_TYPE_CHILD = 2;

    private List<itemtournament.GroupItem> groupItems;

    public void ExpandableRecyclerAdapter(List<itemtournament.GroupItem> groupItems) {
        this.groupItems = groupItems;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if (viewType == VIEW_TYPE_GROUP) {
            View view = inflater.inflate(R.layout.group_item, parent, false);
            return new GroupViewHolder(view);
        } else {
            View view = inflater.inflate(R.layout.child_item, parent, false);
            return new ChildViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder.getItemViewType() == VIEW_TYPE_GROUP) {
            GroupViewHolder groupViewHolder = (GroupViewHolder) holder;
            itemtournament.GroupItem groupItem = groupItems.get(position);
            groupViewHolder.groupTextView.setText(groupItem.getGroupName());
            groupViewHolder.itemView.setOnClickListener(v -> {
                // Handle group item click to expand/collapse child items
                boolean expanded = groupItem.isExpanded();
                groupItem.setExpanded(!expanded);
                notifyDataSetChanged();
            });
        } else {
            ChildViewHolder childViewHolder = (ChildViewHolder) holder;

        }
    }

    @Override
    public int getItemCount() {
        return groupItems.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (groupItems.get(position).isGroup()) {
            return VIEW_TYPE_GROUP;
        } else {
            return VIEW_TYPE_CHILD;
        }
    }

    public static class GroupViewHolder extends RecyclerView.ViewHolder {
        TextView groupTextView;

        public GroupViewHolder(@NonNull View itemView) {
            super(itemView);
            groupTextView = itemView.findViewById(R.id.groupTextView);
        }
    }

    public static class ChildViewHolder extends RecyclerView.ViewHolder {
        TextView childTextView;

        public ChildViewHolder(@NonNull View itemView) {
            super(itemView);
            childTextView = itemView.findViewById(R.id.childTextView);
        }
    }
}
