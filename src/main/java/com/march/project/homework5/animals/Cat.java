package com.march.project.homework5.animals;

import com.march.project.homework5.move.Movement;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        catInit();
    }

    public Cat(String name, Movement movement) {
        super(name, movement);
        catInit();
    }

    private void catInit() {
        this.runSpeed = 5;
        this.swimSpeed = 2;
        this.force = 10;
    }
}
