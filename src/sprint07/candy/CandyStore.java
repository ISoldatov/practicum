package sprint07.candy;

import java.util.Arrays;
import java.util.Set;

public class CandyStore {
    public static void main(String[] args) {
      Candy candy1 = new Candy("Мишка на севере", "Первая кондитерская фабрика", 28, 4, Set.of("Мишка косолапый", "Мишка"));
      Candy candy2 = new Candy("Мишка в лесу", "Триумф", 32, 2, Set.of("Мишка косолапый"));
      Candy candy3 = new Candy("Трюфель", "Триумф", 44, 5, Set.of("Трюфель классический", "Трюфель шоколадный"));
      Candy candy4 = new Candy("Победа", "Первая кондитерская фабрика", 14, 12, Set.of("ПОБЕДА"));

      Candy[] candies = {candy1, candy2, candy3, candy4};

        System.out.println("Сортировка по имени");
        Arrays.sort(candies, Candy::compareByName);
        Arrays.stream(candies).forEach(Candy::printNameWithPrice);

        System.out.println("Сортировка по цене");
        Arrays.sort(candies, Candy::compareByPrice);
        Arrays.stream(candies).forEach(Candy::printNameWithPrice);
    }
}
