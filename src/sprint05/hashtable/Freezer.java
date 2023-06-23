package sprint05.hashtable;

import java.util.HashMap;
import java.util.Map;

public class Freezer {
    public static void main(String[] args) {
        Map<String, Integer> food = new HashMap<>();

        // Добавим продукты:
        food.put("Яблоки", 52);
        food.put("Авокадо", 160);
        food.put("Молоко", 50);
        food.put("Сыр", 357);
        food.put("Пицца", 275);

        // Выведем содержимое в консоль:
        System.out.println("Содержимое холодильника: " + food + ".");

        // Проверим, что все любимые продукты на месте:
        boolean hasApples = food.containsKey("Яблоки");
        System.out.println("А у нас есть яблоки? 🤔 Ответ: " + hasApples + " 🥳.");

        boolean hasCoconuts = food.containsKey("Кокос");
        System.out.println("А у нас есть кокосы? 🤔 Ответ: " + hasCoconuts + " 😱. Срочно вызываем кокосовый отряд!");

        // А сколько килокалорий в пицце? 🤓 Давайте проверим ...
        int caloriesInPizza = food.get("Пицца");
        System.out.println("Пицца содержит " + caloriesInPizza + " килокалорий на 100 г.");

        // Хм, а сколько продуктов в холодильнике? 🧐 Сейчас посмотрим ...
        System.out.println("Сейчас в холодильнике " + food.size() + " продуктов.");

        // А не съесть ли яблоко? 🍏
        food.remove("Яблоки");
        System.out.println("Сейчас в холодильнике " + food.size() + " продукта. Кажется, пора пополнить запасы! 🛒");

        // Выведем содержимое холодильника в консоль:
        for (Map.Entry<String, Integer> entry : food.entrySet()) {
            System.out.println("'" + entry.getKey() + "' содержит " + entry.getValue() + " килокалорий в 100 г.");
        }

        food.clear(); // Удалим все записи из хеш-таблицы.

        // Когда в холодильнике пусто ...
        System.out.println("Сейчас в холодильнике " + food.size() + " продуктов.");

        if (food.isEmpty()) {
            System.out.println("Ничего не осталось! 😯 Срочно заказываем доставку! 🛍");
        } else {
            System.out.println("Всё в порядке! 😎");
        }
    }
}
