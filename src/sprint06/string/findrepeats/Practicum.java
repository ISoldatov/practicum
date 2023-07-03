package sprint06.string.findrepeats;

public class Practicum {
    public static void main(String[] args) {
        FindRepeats check = new FindRepeats();
        int count = check.numberOfRepeats("раз, раз, раз, вввразраб", "раз");
        System.out.println(count);

        Capitalizator check2 = new Capitalizator();
        System.out.println(check2.capitalize("я не волшебник, я только учусь!"));
    }
}
