package com.march.project.homework5;

public class Animals {
    String name;
    float runningSpeed;
    float swimmingSpeed;
    int endurance;

    public void run(int distance) {
        if (endurance <= 0) {
            System.out.println(name + " еще не отдохнул с прошлого забега! Где зеленые? Издевательство над животными!");
            return;
        }

        int distanceCovered = endurance - distance;
        float timeSpent = distance / runningSpeed;

        if (distanceCovered < 0) {
            printDistanceCovered(endurance, timeSpent);
            System.out.println(" упала без сил. И не смогла пробежать еще " + Math.abs(distanceCovered) + " км.");
            endurance = -1;
            return;
        }

        printDistanceCovered(distance, timeSpent);
        endurance = distanceCovered;
        System.out.println(" " + name + " финиширует! Осталось сил: " + endurance);
    }

    private void printDistanceCovered(int distance, float time) {
        System.out.print("\t" + name + " скорость: " + time + " \r");
        for (int i = 0; i < distance; i++) {
            System.out.print("=");
        }
    }

    public String info() {
        return name + ", cил: " + endurance;
    }
}
