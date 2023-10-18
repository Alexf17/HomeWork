package de.telran.hw_6;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        /*Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер).
         Напишите метод getMax, который принимает эти 3 параметра и возвращает наибольший из них.
         Напечатает максимум из трех чисел.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите пожалуйста первое число: ");
        int first = sc.nextInt();
        System.out.print("Введите пожалуйста второе число: ");
        int second = sc.nextInt();
        System.out.print("Введите пожалуйста третье число: ");
        int third = sc.nextInt();

        System.out.println("\nМаксимально из введенных чисел это : " + getMax(first, second, third));
    }

    public static int getMax(int one, int two, int three) {
        int max = one;
        if (two > max) {
            max = two;
        }
        if (three > max) {
            max = three;
        }
        return max;

    }

}
