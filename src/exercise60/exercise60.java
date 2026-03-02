package exercise60;

import java.util.ArrayList;
import java.util.List;

public class exercise60 {

    public static long[] onlyOddDigPrimes(long n) {

        List<Long> array = new ArrayList<>();

        for (long i = 0; i < n; i++) {
            if (isPrime(i) && isAllOdd(i)) {
                array.add(i);
            }
        }

        while (true) {
            n++;
            if (isPrime(n) && isAllOdd(n)) {
                break;
            }
        }
        return new long[] { array.size(), array.get(array.size() - 1), n };
    }

    private static boolean isPrime(long num) {

        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;

        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    private static boolean isAllOdd(long num) {

        for (char c : String.valueOf(num).toCharArray()) {
            if ((c - '0') % 2 == 0) {
                return false;
            }
        }
        return true;
    }

}
