package com.march.project.homework3;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, -2, 3, 3, 7, 0}, {-4, 5, -6, 4, 34, 5}};

        System.out.println();
        System.out.println("Сумма положительных чисел массива: " + sumPositiveElementsOfArray(array));
        System.out.println("Максимальный элемент массива:" + findMaxItemInArray(array));
        printSquare(6);

        // создание квадратного массива
        int[][] arr = creatingSquareArray(8, 5);
        // вывод на экран массива
        printSquareArray(arr);

        zeroingDiagonalsSquareArray(arr);
        printSquareArray(arr);

        int [][] twoDimArray = {{5,7,3,17}, {4, 5}};
        System.out.println(sumElementsGivenRowArray(twoDimArray, 1));
    }

    private static int sumPositiveElementsOfArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    private static void printSquare(int size) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                if (i == 0 || j == 0 || i == size-1 || j == size-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }

    // заполение двумерного квадратного массива произвольной длины
    private static int[][] creatingSquareArray(int size, int number) {
        int[][] resultArr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                resultArr[i][j] = number;
            }
        }
        return resultArr;
    }

    // распечатка массива любой длины
    private static void printSquareArray(int[][] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    // обнуление диагоналей квадратного массива
    private static void zeroingDiagonalsSquareArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || arr.length-1-i == j) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    private static int findMaxItemInArray(int[][] array) {
        int maxItem = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxItem < array[i][j]) {
                    maxItem = array[i][j];
                }
            }
        }
        return maxItem;
    }

    // сумма элементов выбранной строки (нумерация c 0)
    private static int sumElementsGivenRowArray(int[][] array, int numberLine) {
        if (array.length < numberLine + 1) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < array[numberLine].length; i++) {
            sum += array[numberLine][i];
        }
        return sum;
    }
}
