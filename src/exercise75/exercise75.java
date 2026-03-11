package exercise75;

import java.util.ArrayList;
import java.util.Collections;

public class exercise75 {

    public static String[] getCard() {

        ArrayList<String> result = new ArrayList<>();
        final String BINGO = "BINGO";

        for (int i = 0, j = 15; i < 5; i++, j += 15) {

            ArrayList<Integer> generatedNums = new ArrayList<>();
            int counter = j - 14;

            while (generatedNums.size() < 15) {
                generatedNums.add(counter);
                counter++;
            }

            Collections.shuffle(generatedNums);

            for (int k = 0; k < 5; k++) {
                result.add(BINGO.charAt(i) + String.valueOf(generatedNums.get(k)));
            }
        }

        result.remove(10);

        return result.toArray(new String[0]);
    }
}
