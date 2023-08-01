package sprint07.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2023, 1, 1, 1, 10);
        String strDate = ldt.toString();
        System.out.println(strDate);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime n = LocalDateTime.parse(strDate);
        System.out.println(n);
        String sex= "6\r";
        String ss = sex.replaceAll("\r","");
        Integer i = Integer.parseInt(ss);



    }


}
