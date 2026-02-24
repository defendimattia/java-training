package exercise49;

public class exercise49 {

    public static int[] sumParts(int[] ls) {

        int total = 0;

        for (int i : ls) {
            total += i;
        }

        int[] result = new int[ls.length + 1];

        for (int i = 0; i < ls.length; i++) {
            result[i] = total;
            total -= ls[i];
        }

        return result;
    }

}
