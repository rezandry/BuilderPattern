package com.company.Food;

import com.company.Pack.Wrapper;
import com.company.Item;
import com.company.Packing;

// -------------------------------
// Created on 13/04/18 - 10.22
// -------------------------------
public abstract class Burger implements Item {

    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
