package ru.otus.java.basic.homeworks.task5;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 9, 1, 15, 3};
        int[] arr1 = new int[19];
        int[] arr2 = {5, 7, 4, 6, 11, 22, 3, 15};
        int[] arr3 = {15, 45, 3, 11, 22, 19, 26, 5, 4};
        dataEntry();
        sumArray(arr);
        fillArray(arr1);
        fillArrayAdd(arr2);
        sumArrayAdd(arr3);

    }

    public static void dataEntry() {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        String phrase = scanner.nextLine();
        for (int i = 0; i < number; i++) {
            System.out.println(phrase);
        }
    }

    public static void sumArray(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("sum: " + sum);
    }

    public static void fillArray(int[] arr1) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = number1;
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void fillArrayAdd(int[] arr2) {
        Scanner scanner = new Scanner(System.in);
        int number2 = scanner.nextInt();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = number2 + arr2[i];
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void sumArrayAdd(int[] arr3) {
        int result1 = 0;
        for (int i = 0; i < arr3.length / 2; i++) {
            result1 += arr3[i];
        }
        System.out.println(result1);
        int result2 = 0;
        for (int i = arr3.length / 2; i < arr3.length; i++) {
            result2 += arr3[i];
        }
        System.out.println(result2);
        if (result1 > result2) {
            System.out.println("result: " + result1);
        } else {
            System.out.println("result: " + result2);
        }
    }
}


