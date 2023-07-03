package sprint06.string;

public class GradesReversed {

    public static void main(String[] args) {
        String[] grades = new String[] {
                "Вероника Чехова физика — Безупречно",
                "Анна Строкова математика — Потрясающе",
                "Иван Петров геометрия — Безупречно"
        };

        serializeGrades(grades);
    }
    private static String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

//    Вероника Чехова физика — Безупречно
//    вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5"


    public static String serializeGrades(String[] grades) {
        StringBuilder sb = new StringBuilder();
        for (String g : grades) {
            String n=g.replace("— ","").replace(" ",",");
            System.out.println(n);
             n.rgradeStringToInt(n.substring(n.lastIndexOf(",")+1));
            System.out.println(n);
        }
            return null;
    }

}
