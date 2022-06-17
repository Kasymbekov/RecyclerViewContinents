package com.example.recyclerviewcontinents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick, Serializable {
    private RecyclerView recyclerView;
    private ArrayList<Continent> continents;
    private ArrayList<Country> countries;

    public static String KEY_FOR_INTENT = "key1";
    public static String KEY_FOR_COUNTRIES = "key2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        continents = new ArrayList<>();
        countries = new ArrayList<>();

        createContinents(continents);
        createCountries(countries);

        recyclerView = findViewById(R.id.recyclerview_continents);
        ContinentAdapter continentAdapter = new ContinentAdapter(continents, this);

        recyclerView.setAdapter(continentAdapter);

    }

    private void createContinents(ArrayList<Continent> continents) {
        continents.add(new Continent("Africa", R.drawable.africa));
        continents.add(new Continent("Asia", R.drawable.asia));
        continents.add(new Continent("Europe", R.drawable.europe));
        continents.add(new Continent("Oceania", R.drawable.oceania));
        continents.add(new Continent("North America", R.drawable.namerica));
        continents.add(new Continent("South America", R.drawable.samerica));
    }

    private void createCountries(ArrayList<Country> countries) {
        //Africa
        countries.add(new Country("Algeria", "Algiers", continents.get(0), R.drawable.algeria));
        countries.add(new Country("Angola", "Luanda", continents.get(0), R.drawable.angola));
        countries.add(new Country("Egypt", "Cairo", continents.get(0), R.drawable.egypt));
        countries.add(new Country("Ethiopia", "Addis Ababa", continents.get(0), R.drawable.ethiopia));
        countries.add(new Country("Kenya", "Nairobi", continents.get(0), R.drawable.kenya));

        //Asia
        countries.add(new Country("Kyrgyzstan", "Bishkek", continents.get(1), R.drawable.kyrgyzstan));
        countries.add(new Country("Nepal", "Kathmandu", continents.get(1), R.drawable.nepal));
        countries.add(new Country("Japan", "Tokyo", continents.get(1), R.drawable.japan));
        countries.add(new Country("Iraq", "Baghdad", continents.get(1), R.drawable.iraq));
        countries.add(new Country("South Korea", "Seoul", continents.get(1), R.drawable.korea));

        //Europe
        countries.add(new Country("Armenia", "Yerevan", continents.get(2), R.drawable.armenia));
        countries.add(new Country("Belarus", "Minsk", continents.get(2), R.drawable.belarus));
        countries.add(new Country("Belgium", "Brussels", continents.get(2), R.drawable.belgium));
        countries.add(new Country("Croatia", "Zagreb", continents.get(2), R.drawable.croatia));
        countries.add(new Country("Finland", "Helsinki", continents.get(2), R.drawable.finland));

        //Oceania
        countries.add(new Country("Indonesia", "Jakarta", continents.get(3), R.drawable.indonesia));
        countries.add(new Country("Australia", "Canberra", continents.get(3), R.drawable.australia));
        countries.add(new Country("Kiribati", "Tarawa", continents.get(3), R.drawable.kiribati));
        countries.add(new Country("Micronesia", "Palikir", continents.get(3), R.drawable.micronesia));
        countries.add(new Country("New Zealand", "Wellington", continents.get(3), R.drawable.new_zealand));

        //North America
        countries.add(new Country("Costa Rica", "San José", continents.get(4), R.drawable.costa_rica));
        countries.add(new Country("Guatemala", "Guatemala City", continents.get(4), R.drawable.guatemala));
        countries.add(new Country("Honduras", "Tegucigalpa", continents.get(4), R.drawable.honduras));
        countries.add(new Country("Nicaragua", "Managua", continents.get(4), R.drawable.nicaragua));
        countries.add(new Country("Panama", "Panama City", continents.get(4), R.drawable.panama));

        //South America
        countries.add(new Country("Brazil", "Brasilia", continents.get(5), R.drawable.brazil));
        countries.add(new Country("Chile", "Santiago", continents.get(5), R.drawable.chile));
        countries.add(new Country("Colombia", "Bogota", continents.get(5), R.drawable.colombia));
        countries.add(new Country("Peru", "Lima", continents.get(5), R.drawable.peru));
        countries.add(new Country("Venezuela", "Caracas", continents.get(5), R.drawable.venezuela));
    }

    @Override
    public void OnItemClick(int position) {
        Intent intent = new Intent(this, CountryActivity.class);
        intent.putExtra(KEY_FOR_INTENT, continents.get(position).getName());
        intent.putExtra(KEY_FOR_COUNTRIES, countries);
        startActivity(intent);
    }
}