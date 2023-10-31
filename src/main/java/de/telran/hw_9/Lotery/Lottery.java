package de.telran.hw_9.Lotery;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        int count = 3;
        int[][] countOfUsers = new int[3][Constants.COUNT_SET_SIZE];

        for (int i = 0; i < count; i++) {
            int[] userNumbers = Utils.getUserNumbers(i + 1);
            countOfUsers[i] = userNumbers;
        }

        Source source = new Source();
        source.runLottery();
        int[] lotteryNumbers = source.getWinnerNumbers();

        System.out.println("\nCongratulations !!!\n");
        for (int i = 0; i < count; i++) {
            int winnerCount = Utils.checkNumbers(lotteryNumbers, countOfUsers[i]);
            System.out.println("Player " + (i + 1) + " guessed: " + winnerCount + " number('s)!");
        }


    }
}
