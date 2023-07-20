package sprint07.lyamda.email.email2;

import java.util.HashMap;
import java.util.Map;

interface GreetingGenerator {
    String generateGreeting(String login);
}

class EmailCreator {

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
        Map<String, String> fullNames = new HashMap<>();
        fullNames.put("mr_Dark", "Николай");
        fullNames.put("craziest", "Вячеслав Юрьевич");

        // лямбда-функция всё та же
        GreetingGenerator gg = login -> "Приветствуем вас, "
                + fullNames.get(login)
                + " (" + login + ")"
                + "!\n";

        EmailCreator emailCreator = new EmailCreator(gg);
        System.out.println(emailCreator.createEmail("mr_Dark", "Рады видеть вас в нашем приложении"));

        fullNames.put("mr_Dark", "Николай Сергеевич");
        System.out.println(emailCreator.createEmail("mr_Dark", "Рады видеть вас в нашем приложении"));
    }
}
