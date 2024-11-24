package com.march.project.homework7.dishes;

public class Plate {
    private final int maximumSize;  // емкость тарелки
    private int currentAmountFood;  // количество еды в тарелке
    
    public Plate(int maximumSize) {
        this.maximumSize = maximumSize;
        this.currentAmountFood = 0; // при создании тарелка пустая
    }

    public int getCurrentAmountFood() {
        return currentAmountFood;
    }

    public boolean addingFood(int addedAmountFood) {
        int resultFood = currentAmountFood + addedAmountFood;

        if (resultFood > maximumSize) {
            currentAmountFood = maximumSize;
            return false;
        }
        this.currentAmountFood = resultFood;
        return true;
    }

    public void reducingFood(int reducedAmountFood) {
        int resultFood = currentAmountFood - reducedAmountFood;

        if (resultFood < 0) {
            currentAmountFood = 0;
            return;
        }
        currentAmountFood = resultFood;
    }

    @Override
    public String toString() {
        return "В тарелке осталось " + currentAmountFood + " еды";
    }
}
