package exercise70;

public class exercise70 {

    public static long digPow(int n, int p) {

        long sum = 0;

        for (char c : String.valueOf(n).toCharArray()) {
            sum += Math.pow((c - '0'), p);
            p++;
        }

        return sum % n == 0 ? sum / n : -1;
    }
}
