package exercise76;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

public class exercise76 {

    static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    static final String DIGITS = "0123456789";

    public static String makePassword(int len, boolean flagUpper, boolean flagLower, boolean flagDigit) {

        Random rand = new Random();
        ArrayList<Character> result = new ArrayList<>();
        ArrayList<Character> pool = new ArrayList<>();


        if (flagUpper) {
            int r = rand.nextInt(26);
            result.add(UPPER.charAt(r));

            for (char c : UPPER.toCharArray()) {
                if (UPPER.charAt(r) != c) {
                    pool.add(c);
                }
            }
        }

        if (flagLower) {
            int r = rand.nextInt(26);
            result.add(LOWER.charAt(r));

            for (char c : LOWER.toCharArray()) {
                if (LOWER.charAt(r) != c) {
                    pool.add(c);
                }
            }
        }

        if (flagDigit) {
            int r = rand.nextInt(10);
            result.add(DIGITS.charAt(r));

            for (char c : DIGITS.toCharArray()) {
                if (DIGITS.charAt(r) != c) {
                    pool.add(c);
                }
            }

        }

        Collections.shuffle(pool);

        for (int i = result.size(), j = 0 ; i < len; i++, j++) {
            result.add(pool.get(j));
        }

        Collections.shuffle(result);

        return result.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
