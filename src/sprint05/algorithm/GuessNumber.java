package sprint05.algorithm;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(1000) + 1;
        System.out.println("Я загадал число. Попробуйте угадать!");

        Scanner s = new Scanner(System.in);
        int userGuess = -1;

        while (true) {

            userGuess = s.nextInt();

            if (userGuess < target) {
                System.out.println("Ваше число меньше");
            } else if (userGuess > target) {
                System.out.println("Ваше число больше");
            } else if (userGuess == target) {
                System.out.println("Правильный ответ");
                break;
            }
        }
    }
}
