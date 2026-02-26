package exercise56;

import java.util.ArrayList;
import java.util.List;

public class exercise56 {

    public static List<Integer> notPrimes(int a, int b) {
        List<Integer> results = new ArrayList<>();

        while (a < b) {
            boolean bool = true;
            for (char c : String.valueOf(a).toCharArray()) {
                if (c == '2' || c == '3' || c == '5' || c == '7') {
                    continue;
                } else {
                    bool = false;
                    break;
                }
            }

            if (bool) {
                if (!isPrime(a)) {
                    results.add(a);
                }
            }

            a++;
        }
        return results;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
