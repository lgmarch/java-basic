package com.march.project.homework6.area;

public abstract class Area {
    private final String areaName;

    public Area(String areaName) {
        this.areaName = areaName;
    }

    @Override
    public String toString() {
        return "Area " + areaName;
    }
}
