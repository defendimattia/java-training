package exercise42;

public class exercise42 {

    public static int[] myFraction(int[] fractions) {
        int mcd = findMcd(fractions[0], fractions[1]);
        return new int[] { fractions[0] / mcd, fractions[1] / mcd };
    }

    private static int findMcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return findMcd(y, x % y);
    }

}
