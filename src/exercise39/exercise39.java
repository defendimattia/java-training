package exercise39;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class exercise39 {

    public static List<String> singlePermutations(String s) {

        return permutation("", s);

    }

    private static ArrayList<String> permutation(String prefix, String rest) {
        ArrayList<String> result = new ArrayList<>();

        if (rest.length() == 0) {
            result.add(prefix);
        } else {

            Set<Character> used = new HashSet<>();
            for (int i = 0; i < rest.length(); i++) {
                char c = rest.charAt(i);
                if (used.contains(c))
                    continue;
                used.add(c);
                String newPrefix = prefix + c;
                String newRest = rest.substring(0, i) + rest.substring(i + 1);

                result.addAll(permutation(newPrefix, newRest));
            }
        }
        return result;
    }

}
