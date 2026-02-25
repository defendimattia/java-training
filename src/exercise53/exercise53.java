package exercise53;

public class exercise53 {

    private static final int[] SEQUENCE = new int[] { 1, 10, 9, 12, 3, 4 };

    public static long thirt(long n) {

        StringBuilder sb = new StringBuilder(Long.toString(n)).reverse();
        long result = 0;

        for (int i = 0; i < sb.length(); i++) {
            result += Character.getNumericValue((sb.charAt(i))) * SEQUENCE[i % SEQUENCE.length];
        }

        if (result == n) {
            return result;
        } else {
            return thirt(result);
        }
    }
}
