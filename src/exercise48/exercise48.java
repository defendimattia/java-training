package exercise48;

public class exercise48 {

    public static String camelCase(String input) {
        String result = "";

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result += " " + c;
            } else {
                result += c;
            }

        }
        return result;
    }
}
