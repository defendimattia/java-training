package exercise43;

import java.util.Arrays;

public class exercise43 {

    public static int setReducer(int[] input) {
        return findLast(input);
    }

    private static int findLast(int[] array) {

        if (array.length == 1) {
            return array[0];
        }

        int counter = 0;
        int value = array[0];
        int[] newArray = new int[0];

        for (int index = 0; index < array.length; index++) {

            if (array[index] == value) {
                counter++;
            } else {
                newArray = Arrays.copyOf(newArray, newArray.length + 1);
                newArray[newArray.length - 1] = counter;

                value = array[index];
                counter = 1;
            }
        }

        newArray = Arrays.copyOf(newArray, newArray.length + 1);
        newArray[newArray.length - 1] = counter;

        return findLast(newArray);
    }

}
