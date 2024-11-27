package ru.otus.java.basic.homeworks.task3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        greetings();
        checkSign(-3, 4, 8);
        selectColor();
        compareNumbers(5, 4);
        addOrSubtractAndPrint(5, 7, false);
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = (int) (Math.random() * 31);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: " + data);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment != false) {
            int result1 = initValue + delta;
            System.out.println(result1);
        } else {
            int result2 = initValue - delta;
            System.out.println(result2);
        }
    }
}
