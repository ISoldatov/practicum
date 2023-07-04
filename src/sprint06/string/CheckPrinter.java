package sprint06.string;

import java.util.Scanner;


//{"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"}
public class CheckPrinter {
    public static void printCheck(String[] items) {
        for (String item : items) {
            String[] i = item.split(",");
            System.out.printf("%-10s%-7s%-6s",i[0].trim(),i[1].trim(),i[2].trim());
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите количество записей:");
        //int n = Integer.parseInt(scanner.nextLine());
        //String[] values = new String[n];
        String[] values = new String[]{"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"};
//        for (int i = 0; i < values.length; ++i)
//            values[i] = scanner.nextLine();
        printCheck(values);
    }
}
