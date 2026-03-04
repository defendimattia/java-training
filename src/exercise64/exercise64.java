package exercise64;

public class exercise64 {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String search(String line) {
        String result = "";

        for (Character c : ALPHABET.toCharArray()) {
            if (line.toLowerCase().contains(String.valueOf(c))) {
                result += "1";
            } else {
                result += "0";
            }
        }
        return result;
    }
}
