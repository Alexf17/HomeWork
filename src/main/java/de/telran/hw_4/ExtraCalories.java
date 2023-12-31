package de.telran.hw_4;

public class ExtraCalories {
    public static void main(String[] args) {
        /*Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы
        диаметром 24 см вы купите пиццу диаметром 28 см.
        Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр
        пиццы содержит 40 калорий.*/

        int firstPizzaDiameter = 24;
        int secondPizzaDiameter = 28;
        int caloriesPerCm=40;


        /*S = π × r2*/
        double firstPizzaSquare = Math.PI * Math.pow(firstPizzaDiameter / 2, 2);
        double secondPizzaSquare = Math.PI * Math.pow(secondPizzaDiameter / 2, 2);

        double difference = secondPizzaSquare-firstPizzaSquare;
        double extraCalories = difference*caloriesPerCm;

        System.out.println("Количество лишних калорий: " + extraCalories);


    }
}
