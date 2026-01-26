package exercise17;

public class exercise17 {

    public static int[] isPerfectPower(int n) {

        int counter = 0;
        int div = 2;
        int result = n;

        while (result != 1) {

            if (div > Math.sqrt(n)) {
                break;
            }

            if (result % div == 0) {
                result = result / div;
                counter += 1;
            } else {
                result = n;
                div += 1;
                counter = 0;
            }
        }

        if (counter == 0) {
            return null;
        } else {
            return new int[] { div, counter };
        }

    }

}
