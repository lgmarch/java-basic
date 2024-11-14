package com.march.project.homework5.move;

import com.march.project.homework5.animals.Animal;

public class NoSwimMovement extends Movement {

    public float requiredForce(Animal animal, int distance) {
        return -1L;
    }

    @Override
    public int setState(Animal animal, float requiredForce) {
        System.out.println(" " + animal.getName() + " I can`t swim...");
        return 4;
    }
}
