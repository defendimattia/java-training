package exercise73;

public class exercise73 {

    public static String[] oneTwoThree(int n) {

        if (n == 0) {
            return new String[] { "0", "0" };
        }

        return new String[] { "9".repeat(n / 9) + (n % 9 == 0 ? "" : n % 9), "1".repeat(n) };
    }
}
