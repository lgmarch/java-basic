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
        return false;
    }

    public float getPetrol() {
        return petrol;
    }

    @Override
    public void setPetrol(float petrol) {
        this.petrol = petrol;
    }

    @Override
    public boolean run(Area area, int distance) {
        if (area == null) {
            System.out.println("Вы не выбрали куда ехать!");
            return false;
        }

        float spentGas = Math.abs(distance) * gasConsumption; // расчет расхода бензина на поездку
        if (spentGas > petrol) {
            System.out.println("Не достаточно горючки!");
            return false;
        }

        petrol -= spentGas;
        System.out.println("->->->->");
        System.out.println("Приехали!");
        return true;
    }

    @Override
    public String toString() {
        return "Vehicle: " + name +
                ", fuel: " + petrol;
    }
}
