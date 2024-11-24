package com.march.project.homework7;

import com.march.project.homework7.animal.Cat;
import com.march.project.homework7.dishes.Plate;

public class FeedAction {
    public static void feedAction(Cat cat, Plate plate) {
        int food = plate.getCurrentFoodAmount();

        boolean result = cat.eat(food);
        if (result) {
            plate.consumeFood(cat.getAppetite());
        }
    }
}
