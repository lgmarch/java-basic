package com.march.project.homework5;

public class Zoo {
    public static void main(String[] args) {
        Animals[] zoo = {new Cat("Murky"), new Dog("Dominic"), new Horse("Star")};

        for (Animals animals : zoo) {
            System.out.println(animals.info());
        }

        int distance = 10;
        System.out.println("*** Дистанция " + distance + " километров! ***");
        System.out.println("На старт! Внимание! Марш!");
        for (Animals animals : zoo) {
            animals.run(distance);
        }
        System.out.println("*** Финиш! ***");
        for (Animals animals : zoo) {
            System.out.println(animals.info());
        }

        zoo[0].run(5);
    }
}