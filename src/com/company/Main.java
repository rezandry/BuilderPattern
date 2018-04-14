package com.company;

public class Main {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal packetOne = mealBuilder.chickenProgrammerBurger();
        packetOne.showItems();
        System.out.println("Price " +packetOne.getCost());

        System.out.println("--");

        Meal packetTwo = mealBuilder.familyRegularChickenBurer(5);
        packetTwo.showItems();
        System.out.println("Price " +packetTwo.getCost());

        System.out.println("--");

        Meal packetThree = mealBuilder.regularChickenBurer();
        packetThree.showItems();
        System.out.println("Price " +packetThree.getCost());

        System.out.println("--");

        Meal packetFour = mealBuilder.regularVegBurger();
        packetFour.showItems();
        System.out.println("Price " +packetFour.getCost());

        System.out.println("--");

        Meal packetFive = mealBuilder.vegProgrammerBurger();
        packetFive.showItems();
        System.out.println("Price "+packetFive.getCost());

    }
}
