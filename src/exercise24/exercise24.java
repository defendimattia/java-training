package exercise24;

import java.util.ArrayList;
import java.util.List;

public class exercise24 {

    public static int[] sortArray(int[] array) {

        List<Integer> odd = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 1)
                odd.add(num);
        }

        odd.sort(null);

        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = odd.get(index);
                index += 1;
            }
        }

        return array;
    }
}
