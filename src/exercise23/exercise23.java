package exercise23;

import java.util.function.Supplier;

public class exercise23 {

    public static Supplier<Character> makeLooper(String str) {

        int[] pos = { 0 };

        return () -> {
            char c = str.charAt(pos[0]);
            pos[0] = (pos[0] + 1) % str.length();
            return c;
        };

    }
}
