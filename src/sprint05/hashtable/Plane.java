package sprint05.hashtable;

import java.util.*;

public class Plane {
    // Пример списка пассажиров (на самом деле их больше)
    private static List<String> passengerNames = List.of(
            "Василий Петров",
            "Анна Ягирская",
            "Виктория Сотова",
            "Игорь Серов",
            "Людмила Ульянова"
    );

    public static void main(String[] args) {
        Map<String, Integer> seats = assignSeats(passengerNames);
        System.out.println("Места пассажиров: " + seats);
    }

    public static Map<String, Integer> assignSeats(List<String> passengerNames) {
        // Тут нужно написать код, который будет распределять места в самолёте ✈️
        Map<String, Integer> seats = new LinkedHashMap<>();
        int numberFreeSeat=1;
        for (String p : passengerNames) {
            seats.put(p,numberFreeSeat);
            numberFreeSeat++;
        }
        return seats;
    }
}
