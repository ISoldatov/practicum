package sprint09.logger;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class CreateLogger {
    // получаем логер с именем класса, к которому он относится
    private final static Logger log = LoggerFactory.getLogger(CreateLogger.class);

    public static void main(String[] args) {
        // выводим имя логгера
//        System.out.println(log.getName()); // будет выведено: ru.practicum.logging.Practicum
    }
}
