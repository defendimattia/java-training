package exercise37;

public class exercise37 {

    public static double[] tribonacci(double[] s, int n) {

        if (n > 3) {
            while (s.length < n) {

                double[] newS = new double[s.length + 1];

                for (int i = 0; i < s.length; i++) {
                    newS[i] = s[i];
                }

                newS[s.length] = newS[s.length - 1] + newS[s.length - 2] + newS[s.length - 3];
                s = newS;
            }

            return s;
        } else {
            double[] newS = new double[n];

            for (int i = 0; i < n; i++) {
                newS[i] = s[i];
            }

            return newS;
        }

    }
}
