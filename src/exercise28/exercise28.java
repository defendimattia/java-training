package exercise28;

public class exercise28 {

    public static long[] productFib(long prod) {

        long prev = 0;
        long corr = 1;

        while ((prev * corr) < prod) {

            long temp = corr + prev;
            prev = corr;
            corr = temp;
        }

        if (prev * corr == prod) {
            return new long[] { prev, corr, 1 };
        } else {
            return new long[] { prev, corr, 0 };
        }
    }
}
