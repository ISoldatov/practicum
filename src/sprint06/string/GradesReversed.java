package sprint06.string;

public class GradesReversed {

    public static void main(String[] args) {
        String[] grades = new String[]{
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
            String[] w = g.split(" ");
            sb.append(w[0].toLowerCase()).append(",").append(w[1].toLowerCase()).append(",").append(w[2].toUpperCase())
                    .append(",").append(gradeStringToInt(w[4])).append(";");
            System.out.println(sb.toString());
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

}
