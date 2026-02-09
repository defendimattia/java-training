package exercise30;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class exercise30 {

    public static String orderWeight(String strng) {

        String[] array = strng.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String s : array) {
            int value = 0;

            for (int index = 0; index < s.length(); index++) {
                value += s.charAt(index) - '0';
            }

            if (map.containsKey(s)) {
                int i = 1;
                while (map.containsKey(s + "*".repeat(i))) {
                    i++;
                }
                s = s + "*".repeat(i);
            }

            map.put(s, value);
        }

        String result = map.entrySet()
                .stream()
                .sorted(
                        Map.Entry.<String, Integer>comparingByValue()
                                .thenComparing(Map.Entry.comparingByKey()))
                .map(e -> String.valueOf(e.getKey().replaceAll("[*]", "")))
                .collect(Collectors.joining(" "));

        return result;
    }

}
