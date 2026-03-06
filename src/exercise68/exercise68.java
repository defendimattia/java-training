package exercise68;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise68 {

    public static List<String> grabscrab(String s, List<String> words) {
        List<String> results = new ArrayList<>();

        char[] arrayS = s.toCharArray();
        Arrays.sort(arrayS);
        s = String.copyValueOf(arrayS);

        for (String string : words) {
            char[] arrayWord = string.toCharArray();
            Arrays.sort(arrayWord);

            if (s.equals(String.copyValueOf(arrayWord))) {
                results.add(string);
            }
        }
        return results;
    }
}
