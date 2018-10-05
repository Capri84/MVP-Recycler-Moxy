package com.example.capri.mvprecyclermoxy.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.capri.mvprecyclermoxy.R;
import com.example.capri.mvprecyclermoxy.model.Item;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<Item> items;

    public RecyclerAdapter(List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,
                viewGroup, false);
        return new RecyclerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder viewHolder, int position) {
        final Item currentItem = items.get(position);
        viewHolder.titleTextView.setText(currentItem.getTitle());
        viewHolder.pictureImageView.setImageResource(currentItem.getImageResourceId());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HeadActivity.startDetailsActivity(currentItem);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView pictureImageView;
        TextView titleTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            pictureImageView = itemView.findViewById(R.id.picture);
            titleTextView = itemView.findViewById(R.id.title);
        }
    }
}