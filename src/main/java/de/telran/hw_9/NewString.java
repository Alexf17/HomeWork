package de.telran.hw_9;

import java.util.Arrays;

public class NewString {
    public static void main(String[] args) {
      /*  Сформировать строку, сходную с  SQL запросом, используя StringBuilder:
        1) Берем исходную строку с данными из cars
        {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}
        Если значение второго параметра равно null с каждой пары, то параметр не должен попадать в условие отбора, которое задается после ключевого слова WHERE в результирующей строке.
        Пример: строка с данными из users: {"id", 1, "country", null, "city", "Helsinki", "year", null}
        Результат, новая строка:  SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki';*/

        String users = "{\"id\", 1, \"country\", null, \"city\", \"Helsinki\", \"year\", null}";
        String cars = "{\"model\", \"V-60\", \"country\", \"Germany\", \"city\", \"Berlin\", \"year\", null, \"active\", true}";

        String[] carArray = cars.replace("{", "").replace("}", "").replace("\"", "").split(", ");
        String[] userArray = users.replace("{", "").replace("}", "").replace("\"", "").split(", ");

        StringBuilder newStringUsers = new StringBuilder("SELECT * FROM users WHERE ");
        StringBuilder newStringCars = new StringBuilder("SELECT * FROM cars WHERE ");

        getString(carArray, newStringCars);
        getString(userArray, newStringUsers);

        System.out.println(newStringCars);
        System.out.println(newStringUsers);

    }

    public static void getString(String[] array, StringBuilder newString) {
        boolean isFirst = true;

        for (int i = 0; i < array.length; i += 2) {
            String name = array[i];
            String value = array[i + 1];

            if (!value.contains("null")) {
                if (!isFirst) {
                    newString.append(" AND ");
                }
                newString.append(name).append(" = '").append(value).append("'");
                isFirst = false;
            }
        }
    }

}

