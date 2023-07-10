package sprint06.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Try {
    public static void main(String[] args) {

        try (BufferedReader fileReader = new BufferedReader(new FileReader("input.txt"))) {

            fileReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
