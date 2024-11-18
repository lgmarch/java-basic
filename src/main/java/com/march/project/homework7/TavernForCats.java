package com.march.project.homework7;

import com.march.project.homework7.animal.Cat;
import com.march.project.homework7.dishes.Plate;

public class TavernForCats {

    public static void main(String[] args) {
        Plate plate = new Plate(1000);
        System.out.println(plate.addingFood(190));

        // создаем котов
        Cat[] cats = new Cat[10];
        for (int i = 0; i < cats.length; i++) {
            int appetite = (int) (Math.random() * 100);
            cats[i] = new Cat("Кот" + i, appetite);
            System.out.println(cats[i]);
        }

        // кормим котов
        System.out.println();
        for (Cat cat : cats) {
            FeedingAction.feedingAction(cat, plate);
            System.out.println(cat);
        }
    }
}
