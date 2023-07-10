package sprint06.file;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Coder {
    public static void main(String[] args) {

        try (Writer out = new OutputStreamWriter(System.out, StandardCharsets.UTF_8)) {
            out.write(decodeText(
                    "Съешь ещё этих мягких французских булок да выпей же чаю"));

        } catch (IOException e) {
            // игнорируем
        }
    }

    static String decodeText(String input) throws IOException {
        return new BufferedReader(new InputStreamReader(
                new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)),StandardCharsets.UTF_8)).readLine();
    }
}
