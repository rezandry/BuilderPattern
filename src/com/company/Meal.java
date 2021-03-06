package com.company;

// -------------------------------
// Created on 13/04/18 - 10.15
// -------------------------------

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += +item.price();
        }

        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.println(item.name()+" "+item.price()+" "+item.packing().pack());
        }
    }

}
