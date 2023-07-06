package sprint06.exceptions;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        System.out.print("Введите целое число => ");
        Scanner scanner = new Scanner(System.in);
        final String inputValue = scanner.next();
       /* try {
            final int parsedValue = IntegerParser.parseInt(inputValue);
            System.out.println(parsedValue);
        } catch (NullStringException | EmptyStringException exp) {
            System.out.println("Введена пустая строка.");
        } catch (StringNotNumberException e) {
            System.out.println("Вы ввели не целое число.");
        } catch (StringIsTooSmallNumberException exp) {
            System.out.println("Введённое число слишком маленькое.");
        } catch (StringIsTooBigNumberException exp) {
            System.out.println("Введённое число слишком большое.");
        }*/

    }
}
