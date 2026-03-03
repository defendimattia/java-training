package exercise61;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise61 {

    public static int[] snail(int[][] array) {

        if (array[0].length == 0) {
            return new int[] {};
        }

        List<Integer> set = new ArrayList<>();

        while (array.length > 1) {

            for (int top = 0; top < array[0].length; top++) {
                set.add(array[0][top]);
            }

            for (int right = 1; right < array[0].length; right++) {
                set.add(array[right][array.length - 1]);
            }

            for (int bottom = array.length - 2; bottom >= 0; bottom--) {
                set.add(array[array.length - 1][bottom]);
            }

            for (int left = array.length - 2; left >= 1; left--) {
                set.add(array[left][0]);
            }

            if (array.length > 1)
                array = Arrays.copyOfRange(array, 1, array.length - 1);

            for (int i = 0; i < array.length; i++) {
                array[i] = Arrays.copyOfRange(array[i], 1, array[i].length - 1);
            }
        }

        if (array.length == 1) {
            set.add(array[0][0]);
        }

        return set.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
