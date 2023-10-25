package de.telran.hw_9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LostElement {
    public static Random random = new Random();

    public static void main(String[] args) {
        /*Дан массив размера n-1, содержащий только различные целые числа в диапазоне от 1 до n. Найдите недостающий элемент.
        input:
        arr[] = {1,2,3,5}
        out: 4
        arr[] = {6,1,2,8,3,4,7,10,5}
        out: 9*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        int firstNumber = random.nextInt(50) + 1;

        array[0] = firstNumber;

        for (int i = 1; i < array.length; i++) {
            array[i] = array[0]++;
        }
        int randomLostNumber = random.nextInt(array.length);

        int[] newArray = getNewArray(array, randomLostNumber);

        System.out.println("В массиве " + Arrays.toString(mixArray(newArray)) + " нехватает числа " + getMissingNumber(newArray));

    }
    private static int[] getNewArray(int[] array, int randomLostNumber) {
        int[] newArray = new int[array.length - 1];
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != randomLostNumber) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }
        return newArray;
    }
    public static int[] mixArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = random.nextInt(i + 1, arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }
    public static int getMissingNumber(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                return arr[i]+1;
            }
        }
        return 0;
    }
}
