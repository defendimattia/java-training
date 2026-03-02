package exercise59;

import java.util.ArrayList;
import java.util.List;

public class exercise59 {

    public static String[] inArray(String[] array1, String[] array2) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j].contains(array1[i])) {
                    result.add(array1[i]);
                }
            }
        }
        return result.stream()
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }
}
