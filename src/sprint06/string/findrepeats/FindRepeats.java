package sprint06.string.findrepeats;

public class FindRepeats {
    /*int numberOfRepeats(String text, String substring) {
        int marker = 0;
        int count = 0;
        while (marker < text.length()) {
            marker = text.indexOf(substring, marker);
            if (marker >= 0) {
                count++;
                marker = marker + substring.length() + 1;
            } else {
                marker = text.length();
            }
        }
        return count;
    }*/

    int numberOfRepeats(String text, String substring) {
        int marker = 0;
        int count = 0;
        while (text.contains(substring)) {
            count++;
            marker = text.indexOf(substring);
            text=text.substring(text.indexOf(substring)+substring.length());
        }
        return count;
    }



}
