package sprint06.string;

public class TextEditor {
    private boolean isCapsLock = false;

    public void capsLock() {
        // Здесь нужно изменить значение флага isCapsLock на противоположное
        isCapsLock = !isCapsLock;
    }

    public void print(String str) {
        // А здесь распечатать строку в верхнем или нижнем регистре с учётом флага
        System.out.println(isCapsLock?str.toUpperCase():str);

    }
}
