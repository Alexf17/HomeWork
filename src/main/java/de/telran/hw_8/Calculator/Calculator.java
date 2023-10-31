package de.telran.hw_8.Calculator;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.exit;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        Locale.setDefault(Locale.US);
        char answer;
        char sign;
        String[] history = new String[3];

        do {
            System.out.print("Enter number of arguments: ");
            int argCount = scanner.nextInt();
            double[] arguments = new double[argCount];
            char[] signs = new char[arguments.length - 1];

            for (int i = 0; i < arguments.length; i++) {
                System.out.print(String.format("Enter argument #%d: ", i + 1));
                arguments[i] = scanner.nextDouble();

                if (i < arguments.length - 1) {
//                    boolean conditions = signs[i] != '+' && signs[i] != '-' && signs[i] != '/' && signs[i] != '*' && signs[i] != '%';
                    do {
                        System.out.println("Enter math operation (+,-,/,*,%)");
                        String signStr = scanner.next();
                        signs[i] = signStr.charAt(0);
                        if (signs[i] != '+' && signs[i] != '-' && signs[i] != '/' && signs[i] != '*' && signs[i] != '%') {
                            System.out.println("You entered a wrong sign!");
                        }
                    } while (signs[i] != '+' && signs[i] != '-' && signs[i] != '/' && signs[i] != '*' && signs[i] != '%');
                }
            }


            double result = arguments[0];


            for (int i = 1; i < arguments.length; i++) {

                switch (signs[i - 1]) {
                    case '+':
                        result += arguments[i];
                        break;
                    case '-':
                        result -= arguments[i];
                        break;
                    case '*':
                        result *= arguments[i];
                        break;
                    case '/':
                        result /= arguments[i];
                        break;
                    case '%':
                        result /= (int) arguments[i];
                        break;
                }
            }

            StringBuilder stringResult = new StringBuilder();
            for (int i = 0; i < arguments.length; i++) {
                stringResult.append(String.format("%.2f", arguments[i]));
                if (i < arguments.length - 1) {
                    stringResult.append(signs[i]);
                }
            }
            stringResult.append("=").append(String.format("%.2f", result));
            System.out.println(stringResult);

            for (int i = history.length-1; i >0 ; i--) {
                history[i] = history[i-1];
            }
            history[0]=stringResult.toString();

            System.out.println("Computing history: " );
            System.out.println(Arrays.toString(history));

            do {
                System.out.println("Maybe you want to calculate anything else ? Y/N");
                answer = scanner.next().charAt(0);
            }
            while (answer != 'y' && answer != 'Y' && answer != 'N' && answer != 'n');
        } while (answer == 'y' || answer == 'Y');

    }
}
