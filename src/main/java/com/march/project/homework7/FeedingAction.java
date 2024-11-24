package com.march.project.homework7;

import com.march.project.homework7.animal.Cat;
import com.march.project.homework7.dishes.Plate;

public class FeedingAction {
    public static void feedingAction(Cat cat, Plate plate) {
        int food = plate.getCurrentAmountFood();

        boolean result = cat.eat(food);
        if (result) {
            plate.reducingFood(cat.getAppetite());
        }
    }
}
