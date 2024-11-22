package com.march.project.homework6.transport;

import com.march.project.homework6.area.Area;
import com.march.project.homework6.area.Swamp;

public class Hourse extends Transport {
    private int power;

    public Hourse(String name) {
        super(name);
        this.power = 100;
    }

    @Override
    boolean isCanGo(Area area) {
        if (area instanceof Swamp) {
            System.out.println("Машина не может двигаться по " + area);
            return false;
        }
        return true;
    }

    @Override
    public boolean run(Area area, int distance) {
        return false;
    }
}
