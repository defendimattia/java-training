package exercise72;

import java.util.HashMap;
import java.util.Map;

public class exercise72 {

    private static final Map<String, Integer> scoring = Map.of(
            "Wild", 100,
            "Star", 90,
            "Bell", 80,
            "Shell", 70,
            "Seven", 60,
            "Cherry", 50,
            "Bar", 40,
            "King", 30,
            "Queen", 20,
            "Jack", 10);

    public static int fruit(final String[][] reels, final int[] spins) {

        Map<String, Integer> map = new HashMap<>();
        int counter = 0;

        for (String[] reel : reels) {
            map.put(reel[spins[counter]], map.getOrDefault(reel[spins[counter]], 0) + 1);
            counter++;
        }

        if (map.size() == 1) {
            return scoring.get(map.keySet().iterator().next());
        } else if (map.size() == 2) {

            String keyValue1 = null;
            String keyValue2 = null;

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    keyValue1 = entry.getKey();
                } else if (entry.getValue() == 2) {
                    keyValue2 = entry.getKey();
                }
            }
            return keyValue1.equals("Wild") ? (scoring.get(keyValue2) / 10) * 2 : scoring.get(keyValue2) / 10;
        }

        return 0;
    }
}
