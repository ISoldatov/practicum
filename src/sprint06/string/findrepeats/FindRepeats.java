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

    /*int numberOfRepeats(String text, String substring) {
        int marker = 0;
        int count = 0;
        while (text.contains(substring)) {
            count++;
            marker = text.indexOf(substring);
            text=text.substring(text.indexOf(substring)+substring.length());
        }
        return count;
    }
*/

    int numberOfRepeats(String text, String substring) {
        int count = 0;
        StringBuilder sb = new StringBuilder(text);
        while (sb.indexOf(substring) > -1) {
            count++;
            int sIndex = sb.indexOf(substring);
            //sb.delete(0, sIndex + substring.length());
            sb.delete(0, 9);
            System.out.println(sb.toString());
//            text = text.substring(text.indexOf(substring) + substring.length());
        }
        return count;
    }



}
