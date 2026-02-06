package exercise27;

import java.util.Map;

public class exercise27 {

    public static String rgb(int r, int g, int b) {

        String result = "";

        final Map<Integer, String> values = Map.of(
                10, "A",
                11, "B",
                12, "C",
                13, "D",
                14, "E",
                15, "F");

        int[] array = { r, g, b };

        for (int index = 0; index < array.length; index++) {
            if (array[index] < 0) {
                array[index] = 0;
            } else if (array[index] > 255) {
                array[index] = 255;
            }
        }

        for (int i : array) {
            int firstMod = i % 16, secondMod = (i / 16) % 16;

            if (secondMod > 9) {
                result += values.get(secondMod);
            } else {
                result += secondMod;
            }

            if (firstMod > 9) {
                result += values.get(firstMod);
            } else {
                result += firstMod;
            }
        }

        return result;
    }
}
