package exercise78;

import java.util.HashMap;
import java.util.Map;

public class exercise78 {

    static Map<String, String> longToShort = new HashMap<>();
    static Map<String, String> shortToLong = new HashMap<>();
    static int counter = 0;

    public static String urlShortener(String longURL) {

        if (longToShort.containsKey(longURL)) {
            return longToShort.get(longURL);
        } else {
            String newUrl = codeGenerator(counter++);

            longToShort.put(longURL, "short.ly/" + newUrl);
            shortToLong.put("short.ly/" + newUrl, longURL);

            return longToShort.get(longURL);
        }
    }

    public static String urlRedirector(String shortURL) {

        return shortToLong.get(shortURL);
    }

    private static String codeGenerator(int num) {
        StringBuilder sb = new StringBuilder();
        int length = 1;
        int total = 0;

        while (true) {
            int count = (int) Math.pow(26, length);
            if (num < total + count) {
                num -= total;
                break;
            }
            total += count;
            length++;
        }

        for (int i = 0; i < length; i++) {
            sb.append((char) ('a' + (num % 26)));
            num /= 26;
        }
        return sb.reverse().toString();
    }
}
