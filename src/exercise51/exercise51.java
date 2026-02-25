package exercise51;

import java.util.ArrayList;
import java.util.List;

public class exercise51 {

    public static long nextBiggerNumber(long n) {

        List<Integer> array = new ArrayList<>();
        String result = "";

        for (char c : String.valueOf(n).toCharArray()) {
            array.add(Character.getNumericValue(c));
        }

        int index = -1;
        int valueIndex = -1;

        for (int i = array.size() - 2; i >= 0; i--) {
            if (array.get(i) < array.get(i + 1)) {
                index = i;
                valueIndex = array.get(i);
                break;
            }
        }

        if (index == -1) {
            return -1;
        } else {

            int indexTwo = -1;
            int valueIndexTwo = Integer.MAX_VALUE;

            for (int i = index + 1; i < array.size(); i++) {
                if (array.get(i) <= valueIndexTwo && array.get(i) > valueIndex) {
                    indexTwo = i;
                    valueIndexTwo = array.get(i);
                }
            }

            array.set(index, valueIndexTwo);
            array.set(indexTwo, valueIndex);

            for (int i = 0; i <= index; i++) {
                result += array.get(i);
            }

            List<Integer> sub = new ArrayList<>(array.subList(index + 1, array.size()));
            sub.sort(null);

            for (int i = 0; i < sub.size(); i++) {
                result += sub.get(i);
            }

            return Long.valueOf(result);
        }
    }
}
