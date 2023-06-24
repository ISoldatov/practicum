package sprint05.hashtable;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 10);
        numbers.put(2, 20);

        Map<Integer, Integer> numbers2 = new YandexPracticumMap<>();
        numbers2.put(3, 30);
        numbers2.put(4, 40);
    }

    static class YandexPracticumMap<K,V> extends HashMap<K,V> {
        @Override
        public V put(K key, V value) {
            System.out.println("Сохранение значения " + value + " в ключе " + key);
            return super.put(key, value);
        }
    }
}
