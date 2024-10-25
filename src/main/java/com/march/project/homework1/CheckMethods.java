package com.march.project.homework1;

public class CheckMethods {
    public static void main(String[] args) {
        greetings();
        checkSign(1, 2, -3);
        selectColor(5);
        compareNumbers(3, 5);
        addOrSubtractAndPrint(2, 3, false);
    }

    private static void greetings() {
        String[] stringArr = {"Hello", "World", "from", "Java"};

        for (String s : stringArr) {
            System.out.println(s);
        }
    }

    private static void checkSign(int... args) {
        int sum = 0;

        for (int item : args) {
            sum += item;
        }

        if (sum >= 0) {
            System.out.println("Сумма положительная: " + sum);
            return;
        }
        System.out.println("Сумма отрицательная:" + sum);
    }

    private static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Крассный");
        }

        if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }

        if (data > 10) {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers(int number1, int number2) {
        if (number1 >= number2) {
            System.out.println("a >= b");
            return;
        }
        System.out.println("a < b");
    }

    private static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            initValue += delta;
            System.out.println(initValue);
            return;
        }
        initValue -= delta;
        System.out.println(initValue);
    }
}
