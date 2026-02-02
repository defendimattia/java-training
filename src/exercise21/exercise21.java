package exercise21;

public class exercise21 {

    public static int sequence(int[] arr) {

        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        }

        int max = 0;
        String str = "";

        for (int i : arr) {
            if (max + i > 0) {
                max = max + i;
                str+= max + ",";
            } else {
                max= 0;
            }
        }

        if (str.isEmpty()) {
            return 0;
        }

        String[] array = str.split(",");

        for (String s : array) {
            if (Integer.parseInt(s) > max) {
                max = Integer.parseInt(s);
            }
        }

        if (max < 0) {
            return 0;
        } else {
            return max;
        }

    }
}
