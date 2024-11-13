package com.march.project.homework4;

public class Box {
    private final int width;
    private final int height;
    private final int depth;
    private String color;
    private boolean isOpen;
    private final int boxCapacity;
    private int numberOfItems;

    public Box(int width, int height, int depth, String color, int boxCapacity) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.isOpen = false;            // изначально коробка закрыта
        this.boxCapacity = boxCapacity; // емкость коробки
        this.numberOfItems = 0;         // изначально коробка пустая
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void open() {
        this.isOpen = true;
        System.out.println("Коробка открыта.");
    }

    public void close() {
        this.isOpen = false;
        System.out.println("Коробка закрыта.");
    }

    public void getItem() {
        if (!isOpen) {
            System.out.println("Чтобы достать предмет из коробки, надо вначале ее открыть");
            return;
        }
        if (numberOfItems == 0) {
            System.out.println("Коробка пустая.");
            return;
        }
        numberOfItems--;
        System.out.println("Возьмите предмет.");
    }

    public void setItem() {
        if (!isOpen) {
            System.out.println("Чтобы положить предмет в коробку, надо вначале ее открыть");
            return;
        }
        if (numberOfItems >= boxCapacity) {
            System.out.println("Коробка полная. Больше нет места в коробке.");
            return;
        }
        numberOfItems++;
        System.out.println("Предмет в коробке.");
    }

    public void getNumberOfItems() {
        System.out.println("В коробке " + numberOfItems + " предметов.");
    }

    @Override
    public String toString() {
        return "*** Коробка ***" + "\n" +
                "Ширина: " + width + " Высота: " + height + " Глубина: " + depth + "\n" +
                "Емкость коробки : " + boxCapacity + " Цвет: " + color + "\n" +
                (isOpen ? "Коробка открыта" : " коробка закрыта") + "\n" +
                "В коробке: " + numberOfItems + " предметов";
    }
}
