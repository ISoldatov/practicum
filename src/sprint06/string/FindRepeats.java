package sprint06.string;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int count = 0;
        StringBuilder sb = new StringBuilder(text);
        while (sb.indexOf(substring) > -1) {
            count++;
            int sIndex = sb.indexOf(substring);
            sb.delete(sIndex, sIndex + substring.length()+1);
            System.out.println(sb.toString());

//            text = text.substring(text.indexOf(substring) + substring.length());
        }
        return count;
    }
}
