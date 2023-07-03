package sprint06.string;

public class SubstringFunctions {
    public boolean startsWith(String initial, String other) {
        // реализуйте метод
        return initial.indexOf(other) == 0;
    }
    public static boolean endsWith(String initial, String other) {
        return initial.lastIndexOf(other)==initial.length()-other.length();
    }

    public static void main(String[] args) {
        String initial="123456qwerty";
        String other="qwerty";
        System.out.println(initial.length());
        System.out.println(other.length());
        System.out.println(initial.length()-other.length());
        System.out.println(initial.lastIndexOf(other));

    }
}
