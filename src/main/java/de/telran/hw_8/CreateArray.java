package de.telran.hw_8;

import java.util.Random;

public class CreateArray {
    public static void main(String[] args) {
        /*Создайте массив из 8 случайных целых чисел из
        интервала [1;50]
        Выведите массив на консоль в строку.
        Замените каждый элемент с нечетным индексом на ноль.
        Снова выведете массив на консоль в отдельной строке.*/

        int[] ar = new int[8];
        Random random = new Random();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(51);
            System.out.print(ar[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < ar.length; i++) {
            if (i % 2 != 0) {
                ar[i] = 0;
            }
            System.out.print(ar[i] + " ");
        }

    }
}
