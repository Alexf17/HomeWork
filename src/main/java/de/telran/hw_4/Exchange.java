package de.telran.hw_4;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        /*Программа запрашивает у пользователя сумму в Евро для конвертации.
        Реализовать метод, который конвертирует полученную сумму в сумму в долларах США*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter how many euros you want to exchange: ");
        int euro = scanner.nextInt();
        double amount = euro*1.06;
        System.out.println("You can get : " + Math.round(amount * 100.0) / 100.0 + " dollars");
    }
}
