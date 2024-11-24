package com.march.project.homework6.transport;

import com.march.project.homework6.area.Area;

public class AllTerrainVehicle extends Transport {
    private float petrol;
    private float gasConsumption;   // потребеление бензина на 1км

    public AllTerrainVehicle(String name) {
        super(name);
        this.gasConsumption = 0.5F;
    }

    @Override
    boolean isCanGo(Area area) {
        return true;
    }

    @Override
    public boolean run(Area area, int distance) {
        return false;
    }
}
