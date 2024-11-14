package com.march.project.homework5.move;

import com.march.project.homework5.animals.Animal;

public abstract class Movement {
    public abstract float requiredForce(Animal animal, int distance);

    public int setState(Animal animal, float requiredForce) {
        float remainingForce = (animal.getForce() - requiredForce);
        // нет сил для забега
        if (animal.isTired()) {
            System.out.println(animal.getName() + " сошел с дистанции!");
            return 1;
        }

        // преодолел часть дистанции (число отрицительное)
        if (remainingForce < 0) {
            System.out.println(" " + animal.getName() + " без сил. И не может преодолеть оставшиеся " + Math.abs(remainingForce) + " км.");

            animal.setForce(-1);
            return 2;
        }

        // финиширует, но на следующий забег нет сил
        if (remainingForce == 0) {
            animal.setForce(-1);
            return 3;
        }

        // финиширует с запасом сил
        animal.setForce(remainingForce);
        System.out.println(" " + animal.getName() + " финиширует! Осталось сил: " + animal.getForce());
        return 0;
    }
}
