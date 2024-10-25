package com.march.project.homework2;

public class CheckArrays {
    public static void main(String[] args) {
        int[] arr = new int[5];

        printString("hello", 3);
        printSumArrayElementsThatGreaterNumber(new int[]{1, 2, 3, 3}, 2);
        FillArrayGivenNumber(arr, 7);
        printArray(arr);
        IncrementArrayElementGivenNumber(arr, 1);
        printArray(arr);
        printSumOfElementsMostArray(arr);
    }

    private static void printString(String str, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
    }

    private static void printSumArrayElementsThatGreaterNumber(int[] arr, int number) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > number) {
                sum += arr[i];
            }
        }
        System.out.println("Сумма элементов массива, которые больше " + number + " равна " + sum);
    }

    private static void FillArrayGivenNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
    }

    private static void printArray(int[] array) {
        System.out.println("Вывод массива:");

        for (int item : array) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }

    private static void IncrementArrayElementGivenNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] += number;
        }
    }

    private static void printSumOfElementsMostArray(int[] array) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < array.length/2; i++) {
            sum1 += array[i];
        }

        for (int i = array.length/2; i < array.length; i++) {
            sum2 += array[i];
        }

        if (sum1 >= sum2) {
            System.out.println("sum1: " + sum1);
            return;
        }
        System.out.println("sum2: " + sum2);
    }
}
