package com.march.project.homework6.transport;

import com.march.project.homework6.area.Area;

public abstract class Transport {
    String name;
    private Area area;

    public Transport(String name) {
        this.name = name;
        this.area = null;
    }

    abstract boolean isCanGo(Area area);
    public abstract boolean run(Area area, int distance);

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
