package de.telran.hw_2;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        //1
        String myString = "I study Basic Java!";
        char symbol = myString.charAt(myString.length() - 2);
        System.out.println("Предпоследний символ в предложении 'I study Basic Java!' это символ -> " + symbol);



        //2
        if (myString.contains("Java")) {
            System.out.println("Слово Java есть в предложении");
        }
        //3
        String replace = myString.replace("a", "o");
        System.out.println(replace);

        //4
        String upperCase = myString.toUpperCase();
        System.out.println(upperCase);

        //5
        String lowerCase = myString.toLowerCase();
        System.out.println(lowerCase);

        //Part 2

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int myInt = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int myInt2 = scanner.nextInt();
        System.out.print("Выберите необходимое действие: + - / * ");
        scanner.nextLine();
        String myOperation = scanner.nextLine();


        int result = 0;
        switch (myOperation) {
            case "+":
                result = myInt + myInt2;
                break;
            case "-":
                result = myInt - myInt2;
                break;
            case "*":
                result = myInt * myInt2;
                break;
            case "/":
                result = myInt / myInt2;
                break;
            default:
                System.out.println("You must enter a valid operation");
        }
        System.out.println("Result: " + result);



    }
}
