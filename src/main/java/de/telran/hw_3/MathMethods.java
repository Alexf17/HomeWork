package de.telran.hw_3;

import java.util.Scanner;

public class MathMethods {
    public static void main(String[] args) {
        /*№2
        Реализовать программу, выводящую на экран результаты:
        Сложения двух чисел
        Вычитания двух чисел
        Умножения двух чисел
        Деления двух чисел
        Каждая из арифметических операций должна быть реализована как отдельный метод.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int myInt = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int myInt2 = scanner.nextInt();
        System.out.println("\nВаши результаты: ");
        System.out.println("Результат сложения: "+add(myInt,myInt2));
        System.out.println("Результат вычитание: "+subtraction(myInt,myInt2));
        System.out.println("Результат умножения: "+multiplication(myInt,myInt2));
        System.out.println("Результат деления: "+division(myInt,myInt2));

    }

    static int add(int a, int b) {
        int result = a + b;
        return result;
    }
    static int subtraction(int a, int b) {
        int result = a - b;
        return result;
    }
    static int multiplication(int a, int b) {
        int result = a * b;
        return result;
    }
    static int division(int a, int b) {
        int result = a / b;
        return result;
    }
}
