package exercise77;

import java.util.ArrayList;
import java.util.Collections;

public class exercise77 {

    public static int minNumTaxis(int[][] requests) {

        int count = 0;
        int index = 0;
        ArrayList<Integer> dropOffTimes = new ArrayList<>();

        for (int[] request : requests) {
            dropOffTimes.add(request[1]);
        }

        Collections.sort(dropOffTimes);

        for (int[] request : requests) {

            if (request[0] > dropOffTimes.get(index)) {
                index++;
            } else {
                count++;
            }
        }

        return count;
    }
}
