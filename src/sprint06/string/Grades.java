package sprint06.string;

public class Grades {
    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
        // реализуйте метод здесь
        String[] records = grades.split(";");
        for (String r : records) {
            StringBuilder sb = new StringBuilder();
            String[] split = r.split(",");
            sb.append(capitalize(split[0]))
                    .append(" ")
                    .append(capitalize(split[1]))
                    .append(" ")
                    .append(split[2].toLowerCase())
                    .append(" — ")
                    .append(gradeToString(split[3]));
            System.out.println(sb.toString());
        }
    }

}
