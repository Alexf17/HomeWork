package de.telran.hw_8;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
      /*Создайте массив из 5 случайных целых чисел из интервала [10;99]
        Выведите его на консоль в строку.
        Определите и выведите на экран сообщение о том,
        является ли массив строго возрастающей последовательностью.*/

        Random random = new Random();
        int number = 0;
        boolean strict = true;

        int[] ar = new int[5];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(90) + 10;
            if (number > ar[i]) {
                strict = false;
            }
            number = ar[i];

        }
        System.out.println("");
        System.out.println(Arrays.toString(ar));
        System.out.println("\nМассив является строго возрастающей последовательностью? - " + strict);
    }
}
