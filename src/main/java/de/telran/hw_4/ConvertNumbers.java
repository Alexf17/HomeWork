package de.telran.hw_4;

public class ConvertNumbers {
    public static void main(String[] args) {
       /* Переведите число 333 из 16-ричной в 10-ричную
        Переведите число 819 из 10-ричной в 16-ричную
        101101 в двоичной, переведите в 10-ричную
        124 в десятичной, переведите в 2-ичную*/

        String one = "333";
        int two = 819;
        String three = "101101";
        int four = 124;

        System.out.println("Число " + one + " в 16-ричной системе равняется " + Integer.parseInt(one, 16) + " в 10-ричной системе");
        System.out.println("Число " + two + " в 10-ричной системе равняется " + Integer.toHexString(two) + " в 16-ричной системе");
        System.out.println("Число " + three + " в 2-ичной системе равняется " + Integer.parseInt(three, 2) + " в 10-ричной системе");
        System.out.println("Число " + four + " в 10-ричной системе равняется " + Integer.toBinaryString(four) + " в 2-ичной системе");
    }
}
