package sprint05.collections;

import java.util.Arrays;
import java.util.List;

public class AddList {
    public static void main(String[] args) {
        String[] citiesArray = {"Воронеж", "Южно-Сахалинск", "Иркутск"};
        List<String> cities = Arrays.asList(citiesArray);

        List<String> cities2 = Arrays.asList("Воронеж", "Южно-Сахалинск", "Иркутск");

        List<String> cities3 = List.of(citiesArray);
        System.out.println(cities);

        // Создание и заполнение списка из набора значений:
        List<String> otherCities = List.of("Амстердам", "Токио", "Рим");
        System.out.println(otherCities);
    }

    private static void listToArray(){
        // создание и заполнение списка
        List<String> cities = Arrays.asList("Воронеж", "Южно-Сахалинск", "Иркутск");

        String[] citiesArray = cities.toArray(new String[]{}); // преобразование списка в массив

        System.out.println(cities); // напечатали список

        for (String city: citiesArray) { // напечатали массив
            System.out.print(city + ", ");
        }
    }
}
