package exercise19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercise19 {

    public static String mix(String s1, String s2) {

        String cleanS1 = s1.replaceAll("[^a-z]", "");
        String cleanS2 = s2.replaceAll("[^a-z]", "");
        List<String> array = new ArrayList<>();

        for (int i = 0; i < 26; i++) {

            char letter = (char) ('a' + i);
            int countS1 = 0;
            int countS2 = 0;

            for (char c : cleanS1.toCharArray()) {
                if (c == letter) {
                    countS1++;
                }
            }

            for (char c : cleanS2.toCharArray()) {
                if (c == letter) {
                    countS2++;
                }
            }

            if (countS1 > 1 || countS2 > 1) {

                if (countS1 > countS2) {
                    array.add("1:" + (String.valueOf(letter).repeat(countS1)));
                } else if (countS2 > countS1) {
                    array.add("2:" + (String.valueOf(letter).repeat(countS2)));
                } else if (countS1 == countS2) {
                    array.add("=:" + (String.valueOf(letter).repeat(countS1)));
                }
            }

        }

        return array.stream()
                .sorted((i1, i2) -> {

                    char firstC1 = i1.charAt(0);
                    char firstC2 = i2.charAt(0);

                    char lastC1 = i1.charAt(i1.length() - 1);
                    char lastC2 = i2.charAt(i2.length() - 1);

                    if (i1.length() == i2.length()) {

                        if (firstC1 == firstC2) {
                            return Integer.compare(lastC1, lastC2);
                        }
                        return Integer.compare(firstC1, firstC2);
                    }
                    return Integer.compare(i2.length(), i1.length());
                })

                .collect(Collectors.joining("/"));

    }

}