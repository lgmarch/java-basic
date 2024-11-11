package com.march.project.homework5;

public class Cat extends Animals {
    public Cat(String name) {
        this.name = name;
        this.runningSpeed = 5;
        this.swimmingSpeed = 0;
        this.endurance = 10;
        this.isEndurance = false;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " плавать не умеет и снимается с соревнований.");
    }
}
