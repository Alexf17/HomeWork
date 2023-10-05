package de.telran.hw_3;

import java.util.Scanner;

public class CheckWord {
    public static void main(String[] args) {
        /*1
        Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
        Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
        Например:
        ввод - mama, papa
        вывод - mapa*/

        Scanner scanner = new Scanner(System.in);
        String word1, word2;

        do {
            System.out.print("Enter first word with an even number of letters: ");
            word1 = scanner.next();
        } while (!checkEven(word1));
        int halfLength = word1.length()/2;
        String halfWord1 = word1.substring(0, halfLength);

        do {
            System.out.print("Enter second word with an even number of letters: ");
            word2 = scanner.next();
        } while (!checkEven(word2));
         halfLength = word2.length()/2;
        String halfWord2 = word2.substring( halfLength,word2.length() );
         System.out.println(halfWord1 + halfWord2);
    }
    static boolean checkEven(String word) {
        if (word.length() % 2 != 0) {
            System.out.println("Please enter a word with an even number of letters");
            return false;
        }
        return true;
    }
}