package com.example.recyclerviewcontinents;

import java.io.Serializable;

public class Country implements Serializable {
    private String name;
    private String capital;
    private Continent continent;
    private int image;

    public Country(String name, String capital, Continent continent, int image) {
        this.name = name;
        this.capital = capital;
        this.continent = continent;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", continent=" + continent +
                ", image=" + image +
                '}';
    }
}
