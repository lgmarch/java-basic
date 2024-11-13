package com.march.project.homework5.move;

public class NoSwimMovement implements Swim {

    public float swim(int distance, float speed) {
        System.out.println("I can`t swim...");
        return -1L;
    }
}
