package exercise63;

public class exercise63 {

    public static int candles(int candlesNumber, int makeNew) {

        return candlesNumber + burnNew(candlesNumber, makeNew, 0);
    }

    private static int burnNew(int leftOver, int makeNew, int burnCount) {

        if (leftOver < makeNew) {
            return burnCount;
        }
        return burnNew((leftOver / makeNew) + leftOver % makeNew, makeNew, burnCount + (leftOver / makeNew));
    }
}
