package sprint07.optional.candyresult;

public class Practicum {
    public static void main(String[] args) {
        // Доработайте данный метод, чтобы на экран выводилось
        // сообщение в соответствии с заданием

        SearchService searchService = new SearchService();

        searchService.search("Африка").ifPresentOrElse(
                c -> System.out.println("Товар " + c.name + " доступен в количестве " + c.amount + " кг по цене " + c.price + " руб за кг"),
                () -> System.out.println("Данный товар не найден")
        );
    }
}
