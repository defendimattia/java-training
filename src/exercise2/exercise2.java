package exercise2;

public class exercise2 {

    public static String toCamelCase(String string) {

        char[] charsArray = string.toCharArray();
        String result = "";
        boolean bool = false;

        for (char c : charsArray) {

            if (c == '-' || c == '_') {
                bool = true;
                continue;
            }

            result += bool ? Character.toUpperCase(c) : c;
            bool = false;

        }

        return result;
    }

}
