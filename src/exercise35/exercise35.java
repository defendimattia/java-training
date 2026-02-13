package exercise35;

import java.util.Arrays;

public class exercise35 {

    private static int checker(int[] main, int[][] list) {

        int min = main[0];
        int max = main[1];

        for (int index = 0; index < list.length; index++) {
            if (list[index][0] <= max && list[index][1] > min) {
                min = Math.min(min, list[index][0]);
                max = Math.max(max, list[index][1]);
                list[index][0] = 0;
                list[index][1] = 0;
            }
        }

        return max - min;
    }

    public static int sumIntervals(int[][] intervals) {

        int result = 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for (int index = 0; index < intervals.length; index++) {
            if (intervals[index][0] != 0 && intervals[index][1] != 0) {
                result += checker(intervals[index], intervals);
            } else {
                result += intervals[index][1] - intervals[index][0];
            }
        }

        return result;
    }
}
