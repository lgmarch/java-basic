package com.march.project.homework5;

public abstract class Animals {
    String name;
    float runningSpeed;
    float swimmingSpeed;
    int endurance;
    boolean isEndurance;

    public void run(int distance) {
        int distanceCovered = endurance - distance;
        float timeSpent = distance / runningSpeed;

        printStateOfAnimal(distanceCovered, timeSpent);
    }

    public void swim(int distance) {
        int distanceCovered = endurance - distance;
        float timeSpent = distance / swimmingSpeed;

        printStateOfAnimal(distanceCovered, timeSpent);
    }

    public void animalResting (int endurance) {
        this.endurance += endurance;
        this.isEndurance = false;
    }

    private void printStateOfAnimal(int distance, float time) {
        // нет сил для забега
        if (isEndurance) {
            System.out.println(name + " еще не отдохнула с прошлого забега! Где зеленые? Здесь издеваются над животными!");
            return;
        }

        // преодолел часть дистанции
        if (distance < 0) {
            printDistanceCovered(endurance, time);
            System.out.println(" " + name + " без сил. И не может пробежать еще " + Math.abs(distance) + " км.");

            isEndurance = true;
            endurance = -1;
            return;
        }

        // финиширует
        printDistanceCovered(endurance, time);
        endurance = distance;
        System.out.println(" " + name + " финиширует! Осталось сил: " + endurance);

        // но на следующий забег нет сил
        if (distance == 0) {
            isEndurance = true;
        }
    }

    private void printDistanceCovered(int distance, float time) {
        System.out.print(name + "\t" + " Время: " + time + " \t" + name + "\t");

        for (int i = 0; i < distance; i++) {
            System.out.print("=");
        }

    }

    public String info() {
        String str = isEndurance ? "Нет сил" : "Полон сил";

        return name + ", cил: " + endurance + ", " + str;
    }
}
