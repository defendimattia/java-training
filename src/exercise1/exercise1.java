package exercise1;

public class exercise1 {

    public static String stringToNums(String string) {

        String result = "";
        char[] charsArray = string.toCharArray();

        for (char c : charsArray) {

            if (Character.isLetter(c)) {

                int charToNum = (int) Character.toLowerCase(c) - 96;
                result += charToNum + " ";
            }
        }

        return result.stripTrailing();

    }

}
