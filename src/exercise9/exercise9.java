package exercise9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise9 {

    public static String[] dirReduc(String[] arr) {

        List<String> array = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < array.size(); i++) {

            if (array.size() - 1 >= i + 1 ) {
                if ((array.get(i).toLowerCase().equals("north") && array.get(i + 1).toLowerCase().equals("south"))
                        || (array.get(i).toLowerCase().equals("south") && array.get(i + 1).toLowerCase().equals("north"))) {

                    array.remove(i + 1);
                    array.remove(i);

                    i = -1;
                }

                else if ((array.get(i).toLowerCase().equals("east") && array.get(i + 1).toLowerCase().equals("west"))
                        || (array.get(i).toLowerCase().equals("west") && array.get(i + 1).toLowerCase().equals("east"))) {

                    array.remove(i + 1);
                    array.remove(i);

                    i = -1;
                }

            }
        }

        String[] result = array.toArray(new String[0]);

        return result;
    }
}
