package com.example.recyclerviewcontinents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.io.Serializable;
import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity implements Serializable {
    private RecyclerView recyclerView;
    private ArrayList<Country> countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        countries = new ArrayList<>();
        countries = (ArrayList<Country>) getIntent().getSerializableExtra(MainActivity.KEY_FOR_COUNTRIES);

        ArrayList<Country> list = new ArrayList<>();
        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).getContinent().getName().equals(getIntent().getExtras().getString(MainActivity.KEY_FOR_INTENT))) {
                list.add(countries.get(i));
            }
        }
        CountryAdapter countryAdapter = new CountryAdapter(list);
        recyclerView = findViewById(R.id.recyclerview_countries);
        recyclerView.setAdapter(countryAdapter);
    }


}