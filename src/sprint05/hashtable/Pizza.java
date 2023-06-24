package sprint05.hashtable;

import sprint05.rentedfilm.Practicum;

import java.util.HashMap;
import java.util.Map;

public class Pizza {
    // Создадим хеш-таблицу для хранения заказов.
    // В качестве ключа будет имя клиента.
    // В качестве значения — количество заказов от этого клиента.
    private Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {
        Pizza pizzeria = new Pizza();
        pizzeria.openPizzeria();
        pizzeria.printStatistics();
    }

    // Начинаем принимать заказы! 🍕
    private void openPizzeria() {
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Рафаэль");
        newOrder("Леонардо");
        newOrder("Микеланджело");
        newOrder("Шреддер");
        newOrder("Донателло");
    }

    private void newOrder(String clientName) {
        // Сохраните новый заказ в хеш-таблицу. При обновлении счётчика заказов
        // не забудьте учесть заказы, которые уже были сделаны ранее.
        orders.computeIfPresent(clientName, (a, b) -> b + 1);
        orders.putIfAbsent(clientName, 1);
    }

    private void printStatistics() {
        // Выведите собранную статистику в консоль и посчитайте общее количество заказов.
        //
        // Формат для вывода данных в консоль:
        //     Заказов от Микеланджело: 15
        //     Заказов от Леонардо: 4
        //     Всего заказов: 19
        int countOrder = 0;
        for (Map.Entry<String, Integer> entry : orders.entrySet()) {
            System.out.println("Заказов от " + entry.getKey() + ": " + entry.getValue());
            countOrder += entry.getValue();
        }
        System.out.println("Всего заказов: " + countOrder);

    }
}
