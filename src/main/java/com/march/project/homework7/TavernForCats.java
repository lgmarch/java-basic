package com.march.project.homework7;

import com.march.project.homework7.animal.Cat;
import com.march.project.homework7.dishes.Plate;

public class TavernForCats {

    public static void main(String[] args) {
        Plate plate = new Plate(1000);
        System.out.println(plate.addFood(190));

        // создаем котов
        Cat[] cats = new Cat[10];
        for (int i = 0; i < cats.length; i++) {
            int appetite = (int) (Math.random() * 100);
            cats[i] = new Cat("Кот" + i, appetite);
            System.out.println(cats[i]);
        }

        // кормим котов в таверне для котов. В таверне котов кормят из посуды
        System.out.println("*** Коты пируют в таверне ***");
        for (Cat cat : cats) {
            FeedAction.feedAction(cat, plate); // а тут котов кормят из посуды
            System.out.println(cat);
        }

        // Потом эти коты пошли на помойку и сами едят, что найдут
        System.out.println("*** Коты на помойке ***");
        for (Cat cat : cats) {
            int food = (int) (Math.random() * 100);
            cat.eat(food);  // то есть кот может есть еду, что найдет
            System.out.println(cat);
        }
    }
}
