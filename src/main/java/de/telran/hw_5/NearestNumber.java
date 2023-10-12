package de.telran.hw_5;

import java.util.Scanner;

import static java.lang.System.exit;

public class NearestNumber {
    public static void main(String[] args) {

        /**   №1
         Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
         Числа могут быть, как целочисленные, так и дробные.

         Например :
         ввод : m=10.5, n=10.45
         вывод: Число 10.45 ближе к 10.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        double m = scanner.nextDouble();
        System.out.println("Please enter second number");
        double n = scanner.nextDouble();
        if (m == n) {
            System.out.println("You entered the same numbers");
            exit(0);
        }

        System.out.println("Number " + getNearestNumber(m, n) + " is nearest to 10");
    }

    public static double getNearestNumber(double m, double n) {
        double result =10-m;
        double result2 =10-n;

        if (result > result2) {
            return n;
        } else {
            return  m;
        }
    }
}
