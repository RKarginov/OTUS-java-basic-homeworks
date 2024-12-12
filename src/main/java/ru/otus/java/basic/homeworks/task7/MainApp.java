package ru.otus.java.basic.homeworks.task7;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[][] arr2d = {
                {-11, 22, -33},
                {14, -15, -16},
                {27, -18, 19}
        };
        char[][] arr3d = new char[12][12];
        int[][] arr4d = new int[10][10];
        int[][] arr5d = {
                {44, 55, 11},
                {5, 24, 35},
                {9, 84, 15}

        };
        sumOfPositiveElements(arr2d);
        circuit(arr3d);
        zeroMainDiagonal(arr4d);
        findMax(arr5d);
        sumSecondRow(arr5d);


    }

    public static void sumOfPositiveElements(int[][] arr2d) {
        int sumPositive = 0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (arr2d[i][j] > 0) {
                    sumPositive += arr2d[i][j];
                }
            }
        }
        System.out.println("sumPositive = " + sumPositive);
    }

    public static void circuit(char[][] arr3d) {
        for (int i = 0; i < arr3d.length; i++) {
            for (int j = 0; j < arr3d[i].length; j++) {
                if (i == 0 || i == arr3d.length - 1 || j == 0 || j == arr3d[i].length - 1) {
                    arr3d[i][j] = '$';
                    System.out.print(arr3d[i][j] + " ");
                } else {
                    arr3d[i][j] = ' ';
                    System.out.print(arr3d[i][j] + " ");
                }

            }
            System.out.println();
        }

    }

    public static void zeroMainDiagonal(int[][] arr4d) {
        for (int i = 0; i < arr4d.length; i++) {
            for (int j = 0; j < arr4d[i].length; j++) {
                arr4d[i][j] = 1;
                arr4d[i][i] = 0;
            }
        }
        for (int[] row : arr4d) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void findMax(int[][] arr5d) {
        int max = arr5d[0][0];
        for (int i = 0; i < arr5d.length; i++) {
            for (int j = 0; j < arr5d[i].length; j++) {
                if (arr5d[i][j] > max) {
                    max = arr5d[i][j];
                }
            }
        }
        System.out.println("max = " + max);

    }

    public static void sumSecondRow(int[][] arr5d) {
        int sum = 0;
        for (int i = 0; i < arr5d[1].length; i++) {
            sum += arr5d[1][i];
        }
        System.out.println("sum = " + sum);

    }
}







