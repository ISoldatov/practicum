package sprint07.lyamda.email;

interface GreetingGenerator {
    String generateGreeting(String login);
}

class EmailCreator {
    //объект GreetingGenerator используется для генерации приветствия в письме
    private GreetingGenerator greetingCreator;

    public EmailCreator(GreetingGenerator greetingCreator) {
        this.greetingCreator = greetingCreator;
    }

    public String createEmail(String login, String text) {
        return greetingCreator.generateGreeting(login) + text;
    }
}

public class GreetingEmailManager {

    public static void main(String[] args) {
        String fullName = "Николай";

        //лямбда сохранена в переменную gg и будет использована позже
        GreetingGenerator gg = login -> "Приветствуем вас, "
                + fullName
                + " (" + login + ")"
                + "!\n";

        EmailCreator emailCreator = new EmailCreator(gg);
        System.out.println(emailCreator.createEmail("mr_Dark", "Рады видеть вас в нашем приложении"));

    }
}
