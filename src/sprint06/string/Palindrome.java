package sprint06.string;

public class Palindrome {
    public boolean isPalindromeWord(String str) {
        StringBuilder sb = new StringBuilder(str.trim().replaceAll("\\s",""));
        return sb.toString().contentEquals(sb.reverse());
    }
}
