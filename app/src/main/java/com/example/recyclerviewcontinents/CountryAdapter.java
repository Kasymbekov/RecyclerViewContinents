package com.example.recyclerviewcontinents;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> implements Serializable {
    private ArrayList<Country> data1;

    public CountryAdapter(ArrayList<Country> data1) {
        this.data1 = data1;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(data1.get(position).getImage(), data1.get(position).getName(), data1.get(position).getCapital());
    }

    @Override
    public int getItemCount() {
        return data1.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        private TextView textView2;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.country_img);
            textView = itemView.findViewById(R.id.country_text);
            textView2 = itemView.findViewById(R.id.country_capital);
        }

        public void bind(int image, String name, String capital) {
            imageView.setImageResource(image);
            textView.setText(name);
            textView2.setText(capital);
        }
    }
}
