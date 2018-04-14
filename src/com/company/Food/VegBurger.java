package com.company.Food;

// -------------------------------
// Created on 13/04/18 - 10.38
// -------------------------------
public class VegBurger extends Burger {

    @Override
    public String name(){
        return "Vege Burger";
    }

    @Override
    public float price(){
        return 30.0f;
    }
}
