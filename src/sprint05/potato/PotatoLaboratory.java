package sprint05.potato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PotatoLaboratory {
    public static void main(String[] args) {
        List<Potato> potatoes = List.of(
                new Potato(1, 30, 30, 30),
                new Potato(2, 35, 31, 35),
                new Potato(3, 40, 35, 44),
                new Potato(4, 28, 44, 41),
                new Potato(5, 33, 23, 30),
                new Potato(6, 35, 33, 33),
                new Potato(7, 38, 41, 24)
        );
        List<Potato> fourUnderExperiment = findPotatoesForExperiment(potatoes);
        System.out.println("Картофелины для эксперимента: " + fourUnderExperiment);
    }


    private static List<Potato> findPotatoesForExperiment(List<Potato> potatoes) {
        ArrayList<Potato> exp = new ArrayList<>(potatoes);
        exp.sort(Potato::compareTo);
        System.out.println(exp);

        for (Potato p: exp) {
            System.out.println(p.id+":"+p.calculateAlpha());
        }
        System.out.println();

        ArrayList<Potato> alpha = new ArrayList<>(4);
        for (int i = 0; i < 2; i++) {
            Potato p = Collections.min(exp);
            alpha.add(p);
            exp.remove(p);
        }
        for (int i = 0; i < 2; i++) {
            Potato p = Collections.max(exp);
            alpha.add(p);
            exp.remove(p);
        }
        for (Potato p: alpha) {
            System.out.println(p.id+":"+p.calculateAlpha());
        }
        System.out.println();
        alpha.sort(Potato::compareTo);
        for (Potato p: alpha) {
            System.out.println(p.id+":"+p.calculateAlpha());
        }

				/* Вычислите две самые большие и две самые маленькие картофелины,
           а затем выведите их в порядке от самых маленьких до самых больших.*/
        return alpha;
    }
}
