package exercise32;

import java.util.ArrayList;
import java.util.List;

public class exercise32 {

    public static List<long[]> removNb(long n) {

        long toCheck = (n * (n + 1)) / 2;
        List<long[]> list = new ArrayList<>();

        for (long i = 1; i < n; i++) {
            if ((toCheck + 1) % (i + 1) == 0) {
                long j = (toCheck + 1) / (i + 1) - 1;
                if (j < n) {
                    list.add(new long[] { i, j });
                }
            }
        }
        return list;
    }
}
