package com.project.namdharifoods;

import androidx.annotation.NonNull;

public class Dish {
    String title;       // Name of the dish
    String description; // Short details about the dish
    int price;          // Price of the dish

    // Constructor to initialize dish properties
    Dish(String title,String description,int price) {
        this.title=title;
        this.description=description;
        this.price=price;
    }

    @NonNull
    @Override
    public String toString(){
        return title; // Returns dish title when object is converted to string
    }
}
