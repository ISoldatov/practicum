package sprint06.exceptions;

import java.util.Scanner;

public class StackTraceExceptions {
    public static void main(String[] args) {
        System.out.print("Введите целое число => ");
        Scanner scanner = new Scanner(System.in);
        final String inputValue = scanner.next();
       /* try {
            final int parsedValue = IntegerParser.parseInt(inputValue);
            System.out.println(parsedValue);
        } catch (NullStringException | EmptyStringException exception) {
            printException("Введена пустая строка.", exception);
        } catch (StringNotNumberException exception) {
            printException("Вы ввели не целое число.", exception);
        } catch (StringIsTooBigNumberException exception) {
            printException("Введённое число слишком большое.", exception);
        } catch (StringIsTooSmallNumberException exception) {
            printException("Введённое число слишком маленькое.", exception);
        }*/
    }

    private static void printException(final String message, Exception exception) {
        System.out.println(message);
        String mes = exception.getMessage();
        for (StackTraceElement stack: exception.getStackTrace()) {
            System.out.println(String.format("Класс: " + stack.getClassName() + ", " +
                    "метод: " + stack.getMethodName() + ", " +
                    "имя файла: " + stack.getFileName() + ", " +
                    "строка кода: " + stack.getLineNumber()));
        }
        if (mes!=null) {
            System.out.println(mes);
        } else {
            exception.printStackTrace();
        }


    }
}
