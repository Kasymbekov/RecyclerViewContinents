package com.example.recyclerviewcontinents;

import java.io.Serializable;

public class Continent implements Serializable {
    private String name;
    private int image;

    public Continent(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", image=" + image +
                '}';
    }
}
