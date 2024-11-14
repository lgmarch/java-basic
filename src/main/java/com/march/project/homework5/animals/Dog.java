package com.march.project.homework5.animals;

import com.march.project.homework5.move.Movement;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        dogInit();
    }

    public Dog(String name, Movement movement) {
        super(name, movement);
        dogInit();
    }

    private void dogInit() {
        this.runSpeed = 10;
        this.swimSpeed = 5;
        this.swimPowerRequirements = 2;
        this.force = 20;
    }
}
