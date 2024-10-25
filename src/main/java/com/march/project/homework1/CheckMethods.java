package com.march.project.homework1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckMethods {
    public static void main(String[] args) {
        int key;
        boolean reading = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число от 1 до 5. Чтобы выйти из программы введите 0!");

        // если не использовать флаг, а просто true, тогда стр.23 становится ошибкой (т.е. не могу закрыть scanner)
        while (reading) {
            try {
                key = scanner.nextInt();
                runningMethodByNumber(key);
            } catch (InputMismatchException e) {
                // Если я ввожу символ отличный от числа, я вхожу в бесконечный цикл. Как это исправить?
                System.err.println("Необходимо ввести число! " + e.getMessage());
            }
        }
        scanner.close();
    }

    private static void runningMethodByNumber(int numOfMethod) {
        switch (numOfMethod) {
            case 1:
                greetings();
                break;
            case 2:
                checkSign(1, 2, -3);
                break;
            case 3:
                selectColor(5);
                break;
            case 4:
                compareNumbers(3, 5);
                break;
            case 5:
                addOrSubtractAndPrint(2, 3, false);
                break;
            default:
                System.out.println("Введенное число не соответствует диапазону от 1 до 5!");
        }
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
