package exercise46;

import java.util.ArrayList;
import java.util.List;

public class exercise46 {

    public static long[] smallest(long n) {

        ArrayList<Integer> list = new ArrayList<>();
        long min = n;
        long[] result = new long[3];

        for (char c : String.valueOf(n).toCharArray()) {
            list.add(Character.getNumericValue(c));
        }

        for (int c = 0; c < list.size(); c++) {
            ArrayList<Integer> tempList = new ArrayList<>(list);
            tempList.remove(c);

            long[] temp = findSmall(tempList, list.get(c), min);

            if (temp[0] < min) {
                min = temp[0];
                result[0] = temp[0];
                result[1] = c;
                result[2] = temp[1];
            }
        }
        return new long[] { result[0], result[1], result[2] };
    }

    private static long[] findSmall(List<Integer> list, Integer c, long min) {

        int newIndex = 0;

        for (int index = 0; index <= list.size(); index++) {
            list.add(index, c);

            long num = 0;
            for (Integer i : list) {
                num = num * 10 + i;
            }
            if (num < min) {
                newIndex = index;
                min = num;
            }
            list.remove(index);
        }
        return new long[] { min, newIndex };
    }
}
