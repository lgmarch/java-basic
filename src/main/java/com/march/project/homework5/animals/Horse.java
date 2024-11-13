package com.march.project.homework5.animals;

import com.march.project.homework5.move.RunMovement;
import com.march.project.homework5.move.SwimMovement;

public class Horse extends Animal {
    public Horse(String name) {
        runMovement = new RunMovement();
        swimMovement = new SwimMovement();

        this.name = name;
        this.runningSpeed = 40;
        this.swimmingSpeed = 4;
        this.swimPowerRequirements = 4;
        this.endurance = 40;
        this.isTired = false;
    }
}
