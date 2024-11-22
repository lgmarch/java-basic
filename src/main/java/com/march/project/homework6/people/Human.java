package com.march.project.homework6.people;

import com.march.project.homework6.area.Area;
import com.march.project.homework6.transport.Transport;

public class Human {
    private final String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
        this.currentTransport = null;   // изначально у человека нет транспорта
    }

    // сесть в транспорт
    public void getOnTransport(Transport newTransport) {
        if (newTransport == null) {
            throw new IllegalStateException("The transport has not been set yet.");
        }
        currentTransport = newTransport;
        System.out.println("Сел в " + currentTransport);
    }

    // выйти из транспорта
    public void exitTransport() {
        currentTransport = null;
    }

    public boolean run(Area area, int distance) {
        System.out.println("Поехали!");
        return currentTransport.run(area, distance);
    }

    @Override
    public String toString() {
        return "Human: " + name + ", currentTransport: " + (currentTransport == null ? "отсутствует" : currentTransport);
    }
}
