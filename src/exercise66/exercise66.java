package exercise66;

public class exercise66 {

    public static long fibonacci(long max) {
        return findResult(max, 0, 0, 1);
    }

    private static long findResult(long max, long sum, long x, long y) {

        if (y >= max) {
            return sum;
        }

        if (y % 2 == 0) {
            sum += y;
        }

        return findResult(max, sum, y, x + y);
    }
}
