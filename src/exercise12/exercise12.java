package exercise12;

import java.util.Arrays;

public class exercise12 {

    public static String stripComments(String text, String[] commentSymbols) {

        boolean bool = false;
        String result = "";

        for (int i = 0; i < text.length(); i++) {

            if (Arrays.asList(commentSymbols).contains(String.valueOf(text.charAt(i)))) {
                bool = true;
            } else if (text.charAt(i) == '\n') {
                bool = false;
            }

            if (bool == false) {
                result += text.charAt(i);
            }
        }

        return result.replaceAll(" +(?=\\n)", "").replaceAll(" +$", "");    }

}
