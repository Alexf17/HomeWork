package de.telran.hw_9.Lotery;

import java.util.Scanner;

import static de.telran.hw_9.Lotery.Constants.COUNT_SET_SIZE;

public class Utils {
    public static int[] getUserNumbers(int numberOfUser) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[COUNT_SET_SIZE];
        System.out.println("Player "+numberOfUser+",please enter you numbers:");
        for (int i = 0; i < COUNT_SET_SIZE; i++) {
            System.out.print("Enter number " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int checkNumbers(int[] lotteryNumbers, int[] userNumbers) {
        int counter = 0;
        for (int userNumber : userNumbers) {
            for (int lotteryNumber : lotteryNumbers) {
                if (userNumber == lotteryNumber) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

}
