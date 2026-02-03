package exercise22;

import java.util.Arrays;

public class exercise22 {
    public static int greedy(int[] dice) {

        int result = 0;

        for (int index = 1; index <= dice.length + 1; index++) {

            String str = Arrays.toString(dice).replaceAll("[^" + (index) + "]", "");
            int counter = str.length();

            while (counter != 0) {

                if (index == 1) {
                    if (counter >= 3) {
                        counter -= 3;
                        result += 1000;
                    } else {
                        counter -= 1;
                        result += 100;
                    }

                } else if (index == 5 && counter < 3) {
                    counter -= 1;
                    result += 50;

                } else if (counter >= 3) {
                    counter -= 3;
                    result += (index) * 100;
                } else {
                    counter -= 1;
                }

            }

        }

        return result;
    }
}
