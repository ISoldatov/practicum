package sprint05.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Staistica {
    public static void main(String[] args) {
        // список пользователей (логинов) которые посещали сайт за сегодняшний день
        List<String> siteVisitsList = new ArrayList<>();

        // посещения идут в хронологическом порядке
        // (некоторые логины появляются несколько раз,
        // это значит, что пользователь посещал сайт несколько раз в разное время)
        siteVisitsList.add("legioner");
        siteVisitsList.add("hanna7");
        siteVisitsList.add("lono_sun");
        siteVisitsList.add("hurocan");
        siteVisitsList.add("indie_woker");
        siteVisitsList.add("sonya2035");
        siteVisitsList.add("lono_sun");
        siteVisitsList.add("legioner");
        siteVisitsList.add("hanna7");
        siteVisitsList.add("futur100");
        siteVisitsList.add("legioner");

        // выведем статистику посещения сайта на консоль
        System.out.println("Все визиты: " + siteVisitsList);
        System.out.println("Всего визитов: " + siteVisitsList.size() + System.lineSeparator());

        // превратим список в множество — вызовем конструктор HashSet
        // и передадим в него список, который создали ранее
        Set<String> siteVisitsSet = new HashSet<>(siteVisitsList);

        // выведем статистику уникальных посещений сайта на консоль
        System.out.println("Уникальные визиты: " + siteVisitsSet);
        System.out.println("Всего уникальных визитов: " + siteVisitsSet.size());

        // проверим, заходили ли на сайт сегодня конкретные пользователи
        System.out.println("Заходил ли пользователь 'futur100' сегодня на сайт? Ответ: " + siteVisitsSet.contains("futur100"));
        System.out.println("Заходил ли пользователь 'lucky_kitten' сегодня на сайт? Ответ: " + siteVisitsSet.contains("lucky_kitten"));
    }
}
