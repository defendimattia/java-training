package exercise6;

import java.util.HashMap;
import java.util.Map;

public class exercise6 {

    public static boolean scramble(String str1, String str2) {

        HashMap<Character, Integer> str1Map = new HashMap<>();
        HashMap<Character, Integer> str2Map = new HashMap<>();

        for (char c : str1.toCharArray()) {
            str1Map.put(c, str1Map.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            str2Map.put(c, str2Map.getOrDefault(c, 0) + 1);
        }

        boolean bool = false;

        for (Map.Entry<Character, Integer> entry : str2Map.entrySet()) {

            if (str1Map.containsKey(entry.getKey()) && str1Map.get(entry.getKey()) >= entry.getValue()) {
                bool = true;
            } else {
                bool = false;
                break;
            }
        }

        return bool;
    }

}
