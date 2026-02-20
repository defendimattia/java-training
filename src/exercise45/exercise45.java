package exercise45;

import java.util.ArrayList;
import java.util.List;

public class exercise45 {

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {

        if (items.size() == 0) {
            return items;
        } else {
            return killAll(0, k, items, new ArrayList<T>());
        }
    }

    private static <T> List<T> killAll(int index, int k, List<T> survivors, List<T> killed) {

        if (survivors.size() == 1) {
            killed.add(survivors.get(0));
            return killed;
        }

        index = (index + k - 1) % survivors.size();
        killed.add(survivors.get(index));
        survivors.remove(index);

        return killAll(index, k, survivors, killed);
    }
}
