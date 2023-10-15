package de.telran.hw_6;

import java.util.Scanner;

public class LeapOrNo {
    public static void main(String[] args) {
       /** Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год.
        Метод isLeap проверяет високосный год или нет.*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите пожалуйста год: ");
        int year = scanner.nextInt();

        if (isLeap(year)) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }

    }

    public static boolean isLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    }

