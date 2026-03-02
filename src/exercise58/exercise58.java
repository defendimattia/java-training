package exercise58;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class exercise58 {

    public static List<String> detectBruteForce(String[] logs) {
        Set<String> sus = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

        for (String string : logs) {
            String ip = string.replaceAll("[^\\d.]", "");

            if (string.contains("FAIL")) {
                map.put(ip, map.getOrDefault(ip, 0) + 1);
                if (map.get(ip) == 3) {
                    sus.add(ip);
                }
            } else if (string.contains("SUCCESS")) {
                map.put(ip, 0);
            }
        }
        return sus.stream()
                .sorted()
                .toList();
    }
}
