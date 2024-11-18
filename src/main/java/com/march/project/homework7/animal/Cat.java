package com.march.project.homework7.animal;

public class Cat implements Eating {
    private final String name;
    private final int appetite;       // сколько еды может съесть
    private boolean satiety;    // сыт (true) или голоден (false)

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    @Override
    public boolean eat(int foods) {
        if (satiety) {     // если не голоден
            return false;
        }
        if (appetite > foods) {
            return false;
        }
        satiety = true;
        return  true;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", " + (satiety ? "сыт" : "голоден") +
                '}';
    }
}
