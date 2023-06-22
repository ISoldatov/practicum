package sprint05.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutabilityList {
    public static void main(String[] args) {
        final List<String> emptyList = Collections.emptyList();
        final List<String> singletonList = Collections.singletonList("Привет, мир!");
        final List<String> nCopiesList = Collections.nCopies(5, "Java");

//        singletonList.add("Error");

        final ArrayList<String> mutableList = new ArrayList<>(singletonList);

        mutableList.add("NotError");
    }
}
