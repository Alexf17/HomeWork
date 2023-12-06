package de.telran.hw_10;

import java.util.concurrent.ThreadLocalRandom;

public class Utils {
    public static int[] getTwoNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }

        }
        return new int[]{numbers[1], numbers[2]};
    }

    public static int[] getArrays() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 100);
            ;
        }
        return array;
    }
}
