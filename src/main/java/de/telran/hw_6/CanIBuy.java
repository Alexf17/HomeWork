package de.telran.hw_6;

import java.util.Random;

public class CanIBuy {
    public static void main(String[] args) {
        /** Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
         Реализует логический метод canBuy, возвращающий boolean
         Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
         Отобразите строку «Я могу купить еду, это ……» и значение.*/

        Random random = new Random();
        int num = random.nextInt(2);

        boolean isEdekaOpen = (num == 0) ? false : true;
        ;
        boolean isReweOpen = !isEdekaOpen;
        System.out.println("Я могу купить еду,в " + (isEdekaOpen ? "Edeka ! " : "ReWe! ") + "и это " + canBuy(isReweOpen, isEdekaOpen));

    }

    /** В данном случае метод и не нужен, так как логика основана на рандоме, но по заданию нужен метод */
    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        if (isEdekaOpen || isReweOpen) {
            return true;
        } else {
            return false;
        }
    }
}
