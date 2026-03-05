package exercise65;

public class exercise65 {

    public static int adjacentElementsProduct(int[] array) {
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            result = array[i] * array[i + 1] > result ? array[i] * array[i + 1] : result;
        }
        return result;
    }
}
