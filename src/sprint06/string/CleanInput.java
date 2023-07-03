package sprint06.string;

public class CleanInput {
    public String fixString(String str) {
        if (str.isBlank() || str.isEmpty()) {
            System.out.println("Вы ничего не ввели!");
            return null;
        } else {
            return str.trim();
        }
    }
}
