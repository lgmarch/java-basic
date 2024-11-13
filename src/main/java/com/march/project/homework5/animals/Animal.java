package com.march.project.homework5.animals;

import com.march.project.homework5.move.Run;
import com.march.project.homework5.move.Swim;

public abstract class Animal {
    Run runMovement;
    Swim swimMovement;
    String name;
    float runningSpeed;
    float swimmingSpeed;
    int swimPowerRequirements;
    int endurance;
    boolean isTired;

    public void run(int distance) {
        int distanceCovered = endurance - distance;     // преодоленное растояние
        float time = runMovement.run(distance, runningSpeed);
        printDistanceCovered(distanceCovered, time);
        determinationAnimalCondition(distanceCovered, time);
    }

    public void swim(int distance) {
        int distanceCovered = endurance - distance * swimPowerRequirements;
        float time = swimMovement.swim(distance, swimmingSpeed);
        printDistanceCovered(distanceCovered, time);
        determinationAnimalCondition(distanceCovered, time);
    }

    public void rest(int endurance) {
        this.endurance += endurance;
        this.isTired = false;
    }

    private void determinationAnimalCondition(int distance, float time) {
        // нет сил для забега
        if (isTired || time == -1) {
            System.out.println(name + " сошел с дистанции!");
            return;
        }

        // преодолел часть дистанции (число отрицительное)
        if (distance < 0) {
            System.out.println(" " + name + " без сил. И не может преодолеть оставшиеся " + Math.abs(distance) + " км.");

            isTired = true;
            endurance = -1;
            return;
        }

        // финиширует
        endurance = distance;
        System.out.println(" " + name + " финиширует! Осталось сил: " + endurance);

        // но на следующий забег нет сил
        if (distance == 0) {
            isTired = true;
            endurance = -1;
        }
    }

    private void printDistanceCovered(int distance, float time) {
        if (time == -1) {
            return;
        }
        System.out.print(name + "\t" + " Время: " + time + " \t" + name + "\t");

        for (int i = 0; i < distance; i++) {
            System.out.print("=");
        }
    }

    public String info() {
        String str = isTired ? "Нет сил" : "Полон сил";

        return name + ", cил: " + endurance + ", \t" + str;
    }
}
