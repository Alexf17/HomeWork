package de.telran.hw_8;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.exit;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        Locale.setDefault(Locale.US);
        char answer;
        char sign;

        do {
            System.out.print("Enter first argument: ");
            double firstArg = scanner.nextDouble();
            do {
                System.out.println("Enter math operation (+,-,/,*,%");
                String signStr = scanner.next();
                sign = signStr.charAt(0);
                if (sign != '+' && sign != '-' && sign != '/' && sign != '*' && sign != '%') {
                    System.out.println("You entered a wrong sign!");
                }
            } while (sign != '+' && sign != '-' && sign != '/' && sign != '*' && sign != '%');

            System.out.print("Enter second argument: ");
            double secondArg = scanner.nextDouble();
            if (sign == '/' || sign == '%' && secondArg == 0.0) {
                System.out.println("You entered a wrong number!, we cant divide by zero ");
                exit(1);
            }
            double result = 0.0;

            switch (sign) {
                case '+':
                    result = firstArg + secondArg;
                    break;
                case '-':
                    result = firstArg - secondArg;
                    break;
                case '*':
                    result = firstArg * secondArg;
                    break;
                case '/':
                    result = firstArg / secondArg;
                    break;
                case '%':
                    result = (int) (firstArg % secondArg);
                    break;
            }

            System.out.println(String.format("%.2f %s %.2f = %.2f", firstArg, sign, secondArg, result));
            do {
                System.out.println("Maybe you want to calculate anything else ? Y/N");
                answer = scanner.next().charAt(0);
            }
            while (answer != 'Y' && answer != 'Y' && answer != 'N' && answer != 'n');
        } while (answer == 'y' || answer == 'Y');

    }
}
