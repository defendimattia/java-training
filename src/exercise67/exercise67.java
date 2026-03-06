package exercise67;

public class exercise67 {

    public static String encryptThis(String text) {
        String result = "";

        if (text.equals("")) {
            return result;
        }

        for (String word : text.split(" ")) {

            if (word.length() == 1) {
                result += (int) word.charAt(0) + " ";

            } else if (word.length() == 2) {
                result += (int) word.charAt(0) + "" + word.charAt(1) + " ";

            } else {
                char[] chars = word.toCharArray();

                result += ((int) chars[0]) + "" + chars[chars.length - 1];

                for (int i = 2; i < chars.length - 1; i++) {
                    result += chars[i];
                }

                result += chars[1] + " ";
            }
        }
        return result.strip();
    }
}
