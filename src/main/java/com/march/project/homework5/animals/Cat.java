package com.march.project.homework5.animals;

import com.march.project.homework5.move.NoSwimMovement;
import com.march.project.homework5.move.RunMovement;

public class Cat extends Animal {
    public Cat(String name) {
        runMovement = new RunMovement();
        swimMovement = new NoSwimMovement();

        this.name = name;
        this.runningSpeed = 5;
        this.swimmingSpeed = 0;
        this.endurance = 10;
        this.isTired = false;
    }
}
