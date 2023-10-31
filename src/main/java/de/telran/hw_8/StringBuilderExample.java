package de.telran.hw_8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StringBuilderExample {
    private static final Random RAND = ThreadLocalRandom.current();

    public static void main(String[] args) {

    }

    private static boolean isLoginCorrect(String login) {
        if (login == null || login.isBlank() ||login.length() < 5) return false;
        char at = '@';
        char point = '.';
        if (isSymbolCorrect(login, at)) return false;
        if (isSymbolCorrect(login, point)) return false;
        if (login.substring(0, login.indexOf(at)).isEmpty()) return false;
        if (login.substring(login.indexOf(at) + 1, login.indexOf(point)).isEmpty()) return false;
        if (login.substring(login.indexOf(point) + 1).isEmpty()) return false;
        return true;

    }

    private static boolean isPasswordCorrect(String password) {
        if (password == null || password.isBlank() || password.length() < 8) return false;
        if (isContainLowerCase(password) || isContainUpperCase(password)) return false;
        if (isContainDigit(password) || isContainSpecialSymbol(password)) return false;
        return true;
    }

    private static boolean isContainUpperCase(String password) {
        for (char s : password.toCharArray()) {
            if (Character.isUpperCase(s)) return true;
        }
        return false;
    }

    private static boolean isContainLowerCase(String password) {
        for (char s : password.toCharArray()) {
            if (Character.isLowerCase(s)) return true;
        }
        return false;
    }

    private static boolean isContainSymbol(String password, char[] symbols) {
        for (char s : symbols) {
            if (password.contains(s + "")) return true;
        }
        return false;
    }

    private static boolean isContainDigit(String password) {
        return isContainSymbol(password, new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'});

    }
    private static boolean isContainSpecialSymbol(String password){
        return isContainSymbol(password,new char[]{'!', '#', '%', '$'});
    }

    private static boolean isSymbolCorrect(String login, char symbol) {
        return login.indexOf(symbol) <= 0 || login.lastIndexOf(symbol) != login.length() - 1 || login.indexOf(symbol) != login.lastIndexOf(symbol);
    }

    private static String generatePassword() {

        int passLength = RAND.nextInt(8, 15);
        StringBuilder sb = new StringBuilder(passLength);
        while (!isPasswordCorrect(sb.toString()) && sb.length() < passLength) {
            sb.append(generateSymbol());
        }
        return sb.toString();

    }

    private static char generateSymbol() {
        char low = (char) RAND.nextInt('a', 'z' + 1);
        char high = (char) RAND.nextInt('A', 'Z' + 1);
        char digit = (char) RAND.nextInt('0', '9' + 1);
        char[] specials = {'!', '#', '%', '$'};
        char spec = specials[RAND.nextInt(specials.length)];
        char[] result = {low, high, digit, spec};
        return result[RAND.nextInt(specials.length)];
    }
}
