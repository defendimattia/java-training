package exercise29;

public class exercise29 {

    public static String firstNonRepeatingLetter(String s) {

        char[] array = s.toCharArray();
        String result = "";

        for (char c : array) {

            if (s.toLowerCase().replaceAll("[^" + Character.toLowerCase(c) + "]", "").length() == 1) {
                return result += c;
            }
        }
        return result;
    }
}
