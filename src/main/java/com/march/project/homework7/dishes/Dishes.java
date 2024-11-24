package com.march.project.homework7.dishes;

public interface Dishes {
    int getCurrentFoodAmount();
    boolean addFood(int food);
    void consumeFood(int reducedAmountFood);
}

