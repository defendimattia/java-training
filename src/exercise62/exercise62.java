package exercise62;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class exercise62 {

    public static int dblLinear(int n) {

        List<Integer> array = new ArrayList<>();
        array.add(1);
        TreeSet<Integer> pending = new TreeSet<>();

        int index = 0;

        while (array.size() <= n) {

            int x = 2 * array.get(index) + 1;
            int y = 3 * array.get(index) + 1;

            pending.add(x);
            pending.add(y);

            int min = pending.first();

            array.add(min);
            pending.remove(min);
            
            index++;
        }
        return array.get(n);
    }
}
