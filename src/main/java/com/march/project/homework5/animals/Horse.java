package com.march.project.homework5.animals;

import com.march.project.homework5.move.Movement;

public class Horse extends Animal {
    public Horse(String name) {
        super(name);
        horseInit();
    }

    public Horse(String name, Movement movement) {
        super(name, movement);
        horseInit();
    }

    private void horseInit() {
        this.runSpeed = 40;
        this.swimSpeed = 4;
        this.swimPowerRequirements = 4;
        this.force = 40;
    }
}
