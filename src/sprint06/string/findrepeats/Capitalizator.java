package sprint06.string.findrepeats;

public class Capitalizator {
    public String capitalize(String str) {
        String s = str.substring(0,1).toUpperCase()+str.substring(1);
        return s;
    }
}
