package com.company.Drink;

import com.company.Pack.Bottle;
import com.company.Item;
import com.company.Packing;

// -------------------------------
// Created on 13/04/18 - 10.36
// -------------------------------
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
