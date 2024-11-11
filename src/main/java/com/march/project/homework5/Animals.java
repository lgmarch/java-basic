package com.march.project.homework5;

public abstract class Animals {
    String name;
    float runningSpeed;
    float swimmingSpeed;
    int endurance;
    boolean isEndurance;

    public void run(int distance) {
        // нет сил для забега
        if (isEndurance) {
            System.out.println(name + " еще не отдохнула с прошлого забега! Где зеленые? Здесь издеваются над животными!");
            return;
        }

        int distanceCovered = endurance - distance;
        float timeSpent = distance / runningSpeed;

        // преодолел часть дистанции
        if (distanceCovered < 0) {
            isEndurance = true;
            endurance = -1;

            printDistanceCovered(distanceCovered + distance, timeSpent);
            System.out.println(" " + name + " без сил. И не может пробежать еще " + Math.abs(distanceCovered) + " км.");
            return;
        }

        // финиширует
        printDistanceCovered(distance, timeSpent);
        endurance = distanceCovered;
        System.out.println(" " + name + " финиширует! Осталось сил: " + endurance);

        // но на следующий забег нет сил
        if (distanceCovered == 0) {
            isEndurance = true;
        }
    }

    public abstract void swim(int distance);

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
