package com.example.recyclerviewcontinents;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> implements Serializable {
    private ArrayList<Continent> continents;
    private OnItemClick onItemClick;

    public ContinentAdapter(ArrayList<Continent> continents, OnItemClick onItemClick) {
        this.continents = continents;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continents.get(position).getImage(), continents.get(position).getName());
        holder.itemView.setOnClickListener(view -> {
            onItemClick.OnItemClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

    class ContinentViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;

        public ContinentViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.continent_img);
            textView = itemView.findViewById(R.id.continent_text);
        }

        public void bind(int img, String str) {
            imageView.setImageResource(img);
            textView.setText(str);
        }
    }
}
