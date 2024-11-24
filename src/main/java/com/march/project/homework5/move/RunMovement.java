package com.march.project.homework5.move;

import com.march.project.homework5.animals.Animal;

public class RunMovement extends Movement {
    public float requiredForce(Animal animal, int distance) {
        return distance;     // преодоленное растояние
    }
}
