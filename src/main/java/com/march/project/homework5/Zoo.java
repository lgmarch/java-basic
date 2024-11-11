package com.march.project.homework5;

public class Zoo {
    public static void main(String[] args) {
        Animals[] zoo = {new Cat("Murky"), new Dog("Dominic"), new Horse("Star")};

        printZoo(zoo);

        int distance = 10;

        // running
        System.out.println();
        System.out.println("*** Бег. Дистанция " + distance + " километров! ***");
        System.out.println("На старт! Внимание! Марш!");
        for (Animals animals : zoo) {
            animals.run(distance);
        }
        System.out.println("*** Финиш! ***");
        System.out.println();
        printZoo(zoo);

        zoo[0].run(5);

        // resting
        System.out.println();
        System.out.println("*** Relax! ***");
        for (Animals animal : zoo) {
            animal.animalResting(20);
        }
        printZoo(zoo);

        // swimming
        System.out.println();
        System.out.println("*** Плавание. Дистанция " + distance + " километров! ***");
        System.out.println("На старт! Внимание! Марш!");
        for (Animals animals : zoo) {
            animals.swim(distance);
        }
        System.out.println("*** Финиш! ***");
        System.out.println();
        printZoo(zoo);
    }

    public static void printZoo(Animals[] animals) {
        for (Animals animal : animals) {
            System.out.println(animal.info());
        }
    }
}
