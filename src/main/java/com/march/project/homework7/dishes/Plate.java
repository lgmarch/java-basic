package com.march.project.homework7.dishes;

public class Plate implements Dishes {
    private final int maximumSize;  // емкость
    private int currentFoodAmount;  // количество еды в данный момент

    public Plate(int maximumSize) {
        this.maximumSize = maximumSize;
        this.currentFoodAmount = 0; // при создании тарелка пустая
    }

    @Override
    public int getCurrentFoodAmount() {
        return currentFoodAmount;
    }

    @Override
    public boolean addFood(int addedAmountFood) {
        int resultFood = currentFoodAmount + Math.abs(addedAmountFood);

        if (resultFood > maximumSize) {
            currentFoodAmount = maximumSize;
            return false;
        }
        this.currentFoodAmount = resultFood;
        return true;
    }

    @Override
    public void consumeFood(int reducedAmountFood) {
        int resultFood = currentFoodAmount - Math.abs(reducedAmountFood);

        if (resultFood < 0) {
            currentFoodAmount = 0;
            return;
        }
        currentFoodAmount = resultFood;
    }

    @Override
    public String toString() {
        return "В тарелке осталось " + currentFoodAmount + " еды";
    }
}
