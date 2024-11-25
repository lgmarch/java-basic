package com.march.project.homework6.transport;

import com.march.project.homework6.area.Area;
import com.march.project.homework6.area.Swamp;

public class Bicycle extends Transport {
    public Bicycle(String name) {
        super(name);
    }

    @Override
    boolean isCanGo(Area area) {
        if (area instanceof Swamp) {
            System.out.println("Машина не может двигаться по " + area);
            return true;
        }
        return false;
    }

    @Override
    public boolean run(Area area, int distance) {
        return false;
    }

    @Override
    public void setPetrol(float petrol) {

    }
}
