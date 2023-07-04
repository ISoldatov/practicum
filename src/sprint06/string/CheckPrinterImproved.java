package sprint06.string;

import java.util.Scanner;

public class CheckPrinterImproved {
    private static int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void printCheck(String[] items) {
        String[] titles = new String[items.length];
        String[] amount = new String[items.length];
        String[] price = new String[items.length];
        int count = 0;
        for (String item : items) {
            String[] i = item.split(",");
            titles[count] = i[0].trim();
            amount[count] = i[1].trim();
            price[count] = i[2].trim();
            count++;
        }
        int maxTitle = findMaxLength(titles);
        int maxAmount = findMaxLength(amount);
        int maxPrice = findMaxLength(price);

        for (int i=0; i<items.length; i++) {
            StringBuilder output = new StringBuilder();
             output.append("%-").append(maxTitle+2).append("s").append("%-").append(maxAmount+2).append("s")
                             .append("%-").append(maxPrice+2).append("s");
            System.out.printf(output.toString(),titles[i],amount[i],price[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите количество записей:");
//        int n = Integer.parseInt(scanner.nextLine());
//        String[] values = new String[n];
        String[] values = new String[]{"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"};
        printCheck(values);
    }
}
