package de.telran.hw_10;

import java.util.Arrays;

import static de.telran.hw_10.Utils.getArrays;
import static de.telran.hw_10.Utils.getTwoNumbers;

public class Main {
    public static void main(String[] args) {
        int[] newArr = getArrays();
        System.out.println();
        System.out.println("Массив случайных чисел: "+Arrays.toString(newArr));
        System.out.println("Второй и третий по минимальности элемент: "+Arrays.toString(getTwoNumbers(newArr)));
    }




    }
