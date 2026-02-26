package exercise55;

public class exercise55 {

    public static String solve(int a, int b) {

        String primes = "1";
        int counter = 1;

        while (primes.length() < (a + b)) {
            counter += 2;
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(counter); i++) {
                if (counter % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes += counter;
            }
        }
        return primes.substring(a, a + b);
    }
}
