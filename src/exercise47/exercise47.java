package exercise47;

public class exercise47 {

    public static String high(String s) {

        String[] words = s.split(" ");

        String result = "";
        int highestValue = Integer.MIN_VALUE;

        for (String word : words) {
            if (wordValue(word) > highestValue) {
                result = word;
                highestValue = wordValue(word);
            }
        }
        return result;
    }

    private static int wordValue(String word) {

        final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        char[] chars = word.toCharArray();
        int result = 0;

        for (char c : chars) {
            result += ALPHABET.indexOf(c) + 1;
        }
        return result;
    }
}
