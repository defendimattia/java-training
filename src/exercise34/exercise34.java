package exercise34;

import java.util.LinkedHashMap;
import java.util.Map;

public class exercise34 {

    public static String factors(int n) {

        int counter = 2;
        Map<String, Integer> map = new LinkedHashMap<>();
        String result = "";

        while (n > 1) {
            if (n % counter == 0) {

                if (map.containsKey(String.valueOf(counter))) {
                    map.put(String.valueOf(counter), map.get(String.valueOf(counter)) + 1);
                } else {
                    map.put(String.valueOf(counter), 1);
                }

                n = n / counter;
                counter = 2;
            } else {
                counter++;
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result += entry.getValue() > 1 ? ("(" + entry.getKey() + "**" + entry.getValue() + ")")
                    : ("(" + entry.getKey() + ")");
        }

        return result;
    }

}
