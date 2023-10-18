package de.telran.hw_7;

import java.util.Random;

public class Temperature {
    public static void main(String[] args) {
        /*№1.
        Представим, что у нас есть устройство, в котором две колбы.
        Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
        Вы должны написать метод, который проверяет это устройство.
        Ваша программа должна иметь переменные temperature1 и temperature2.
        В результате метод возвращает true или false.*/

        Random random = new Random();
        int temperature1 = random.nextInt(200);
        int temperature2 = random.nextInt(200);

        boolean isWorking =  checkDevice(temperature1, temperature2);
        System.out.println(isWorking ? "Device is working" : "Device does not work");

    }
    public static boolean checkDevice(int a, int b){
        return a>100 && b<100;
    }
}
