package com.march.project.homework5;

import com.march.project.homework5.animals.Animal;
import com.march.project.homework5.animals.Cat;
import com.march.project.homework5.animals.Dog;
import com.march.project.homework5.animals.Horse;

public class Race {
    public static void main(String[] args) {
        Animal[] zoo = {new Cat("Murky"), new Dog("Dominic"), new Horse("Star")};

        printZoo(zoo);

        int distance = 20;

        // running
        System.out.println();
        System.out.println("*** Бег. Дистанция " + distance + " километров! ***");
        System.out.println("На старт! Внимание! Марш!");
        for (Animal animal : zoo) {
            animal.run(distance);
        }
        System.out.println("*** Финиш! ***");
        System.out.println();
        printZoo(zoo);

        zoo[0].run(5);

        // resting
        System.out.println();
        System.out.println("*** Relax! ***");
        for (Animal animal : zoo) {
            animal.rest(20);
        }
        printZoo(zoo);

        // swimming
        System.out.println();
        System.out.println("*** Плавание. Дистанция " + distance + " километров! ***");
        System.out.println("На старт! Внимание! Марш!");
        for (Animal animal : zoo) {
            animal.swim(distance);
        }
        System.out.println("*** Финиш! ***");
        System.out.println();
        printZoo(zoo);
    }

    public static void printZoo(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println(animal.info());
        }
    }
}
