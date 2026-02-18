package exercise41;

public class exercise41 {

    public static int compute(int x, int y) {
        if (y == 0) {
            return x;
        }
        return compute(y, x % y);
    }

}
