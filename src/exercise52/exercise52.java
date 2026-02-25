package exercise52;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class exercise52 {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        Map<String, Integer> map = new HashMap<>();
        int[] result = new int[0];

        if (maxOccurrences > 0) {
            for (int i : elements) {
                String key = String.valueOf(i);

                if (!map.containsKey(key) || map.get(key) < maxOccurrences) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = i;
                    map.put(key, map.getOrDefault(key, 0) + 1);
                }
            }
        }
        return result;
    }
}
