package com.company;

import com.company.Drink.Coffe;
import com.company.Drink.Coke;
import com.company.Food.ChickenBurger;
import com.company.Food.VegBurger;

// -------------------------------
// Created on 13/04/18 - 10.49
// -------------------------------
public class MealBuilder {
    public Meal vegProgrammerBurger(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coffe());
        return meal;
    }

    public Meal chickenProgrammerBurger(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coffe());
        return meal;
    }

    public Meal regularVegBurger(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal regularChickenBurer(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal familyRegularChickenBurer(Integer familySize){
        Meal meal = new Meal();
        for(int i = 0; i<familySize; i++){
            meal.addItem(new ChickenBurger());
            meal.addItem(new Coke());
        }
        return meal;
    }
}
