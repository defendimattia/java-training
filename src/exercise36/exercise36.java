package exercise36;

public class exercise36 {

    public static int zeros(int n) {

        int count = 0;

        while (n > 0) {
            n = n / 5;
            count += n;
        }

        return count;
    }
}
