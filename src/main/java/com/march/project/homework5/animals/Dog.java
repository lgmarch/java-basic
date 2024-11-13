package com.march.project.homework5.animals;

import com.march.project.homework5.move.RunMovement;
import com.march.project.homework5.move.SwimMovement;

public class Dog extends Animal {
    public Dog(String name) {
        runMovement = new RunMovement();
        swimMovement = new SwimMovement();

        this.name = name;
        this.runningSpeed = 10;
        this.swimmingSpeed = 5;
        this.swimPowerRequirements = 2;
        this.endurance = 20;
        this.isTired = false;
    }
}
