package com.example.splashscreen.Adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.splashscreen.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<String> parentList;
    private List<List<String>> childList;
    private boolean[] isExpandedArray;

    public RecyclerViewAdapter(List<String> parentList, List<List<String>> childList) {
        this.parentList = parentList;
        this.childList = childList;
        this.isExpandedArray = new boolean[parentList.size()];
    }

    @Override
    public int getItemCount() {
        return parentList.size();
    }

    @Override
    public int getItemViewType(int position) {
        // Return the view type based on your logic (if needed)
        return super.getItemViewType(position);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_parent, parent, false);
        return new ParentViewHolder(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof ParentViewHolder) {
            final ParentViewHolder parentViewHolder = (ParentViewHolder) holder;
            final String parentText = parentList.get(position);
            parentViewHolder.parentTextView.setText(parentText);

            // Set the click listener for the parent item
            parentViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (childListVisible(position)) {
                        // If child items are visible, hide them
                        hideChildItems(position);
                    } else {
                        // If child items are hidden, show them
                        showChildItems(position);
                    }
                }
            });

            // Update the visibility of child items based on the expanded state
            boolean isExpanded = childListVisible(position);
            parentViewHolder.parentTextView.setCompoundDrawablesWithIntrinsicBounds(
                    0, 0, isExpanded ? com.hbb20.R.drawable.ccp_ic_arrow_drop_down : R.drawable.ic_baseline_keyboard_arrow_down_24, 0
            );
        }
    }

    private boolean childListVisible(int parentPosition) {
        return isExpandedArray[parentPosition];
    }

    private void showChildItems(int parentPosition) {
        isExpandedArray[parentPosition] = true;
        notifyItemChanged(parentPosition);
    }

    private void hideChildItems(int parentPosition) {
        isExpandedArray[parentPosition] = false;
        notifyItemChanged(parentPosition);
    }

    // ViewHolder for parent items
    class ParentViewHolder extends RecyclerView.ViewHolder {
        TextView parentTextView;

        ParentViewHolder(View itemView) {
            super(itemView);
            parentTextView = itemView.findViewById(R.id.parentTextView);
        }
    }

    // ViewHolder for child items (if needed)
    // If child items have a different layout, you can create a separate ViewHolder for them

}