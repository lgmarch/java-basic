package com.march.project.homework5.animals;

import com.march.project.homework5.move.Movement;

public abstract class Animal {
    Movement movement;

    String name;
    float runSpeed;
    float swimSpeed;
    int swimPowerRequirements;
    float force;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, Movement movement) {
        this.name = name;
        this.movement = movement;
    }

    public String getName() {
        return name;
    }

    public int getSwimPowerRequirements() {
        return swimPowerRequirements;
    }

    public float getForce() {
        return force;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public void setForce(float force) {
        this.force = force;
    }

    public boolean isTired() {
        return force == -1;
    }

    public float run(int distance) {
        float requiredForce = movement.requiredForce(this, distance);
        int state = movement.setState(this, requiredForce);
        return state == 0 ? distance/runSpeed : 0;
    }

    public float swim(int distance) {
        float requiredForce = movement.requiredForce(this, distance);
        int state = movement.setState(this, requiredForce);
        return state == 0 ? distance/swimSpeed : 0;
    }

    public String info() {
        String str = isTired() ? "Нет сил" : "Полон сил";

        return name + ", cил: " + force + ", \t" + str;
    }
}
