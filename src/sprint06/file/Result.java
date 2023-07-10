package sprint06.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Result {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();

        FileReader reader = new FileReader("result.txt");
        BufferedReader br = new BufferedReader(reader);

        while (br.ready()) {
            String s = br.readLine();
            frequencyMap.computeIfPresent(s, (a, b) -> b + 1);
            frequencyMap.putIfAbsent(s, 1);
        }
        for (Map.Entry<String,Integer> e: frequencyMap.entrySet()) {
            System.out.println(e.getKey()+": "+e.getValue());
        }


        // читайте файл построчно и сразу обновляйте frequencyMap.

        // выведите результат в формате "<буква>: <количество>".

    }
}
