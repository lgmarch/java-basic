package com.march.project.homework5;

import com.march.project.homework5.animals.Animal;
import com.march.project.homework5.animals.Cat;
import com.march.project.homework5.animals.Dog;
import com.march.project.homework5.animals.Horse;
import com.march.project.homework5.move.NoSwimMovement;
import com.march.project.homework5.move.RunMovement;
import com.march.project.homework5.move.SwimMovement;

import java.util.ArrayList;
import java.util.List;

public class Race {
    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>();

        Animal cat = new Cat("Murky");
        Animal dog = new Dog("Dominic");
        Animal horse = new Horse("Star");

        zoo.add(cat);
        zoo.add(dog);
        zoo.add(horse);
        printZoo(zoo);

        // running
        System.out.println();
        int distance = 5;
        cat.setMovement(new RunMovement());
        dog.setMovement(new RunMovement());
        horse.setMovement(new RunMovement());

        System.out.println("*** Бег. Дистанция " + distance + " километров! ***");
        System.out.println("На старт! Внимание! Марш!");
        for (Animal animal : zoo) {
            animal.run(distance);
        }
        System.out.println("*** Финиш! ***");
        System.out.println();
        printZoo(zoo);

        // swimming
        System.out.println();
        System.out.println("*** Плавание. Дистанция " + distance + " километров! ***");
        cat.setMovement(new NoSwimMovement());
        dog.setMovement(new SwimMovement());
        horse.setMovement(new SwimMovement());

        System.out.println("На старт! Внимание! Марш!");
        for (Animal animal : zoo) {
            animal.swim(distance);
        }
        System.out.println("*** Финиш! ***");
        System.out.println();
        printZoo(zoo);
    }

    public static void printZoo(List<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.info());
        }
    }
}
