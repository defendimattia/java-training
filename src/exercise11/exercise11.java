package exercise11;

public class exercise11 {

    public static String rangeExtraction(int[] arr) {

        String result = "";
        int counter = 0;
        Integer prev = arr[0];
        Integer indexStart = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == prev + 1) {
                prev = arr[i];
                counter += 1;

                if (counter == 2) {
                    indexStart = i - 2;
                }

            } else {

                if (counter >= 2) {
                    result += arr[indexStart] + "-" + arr[i - 1] + ",";
                } else if (counter == 1) {
                    result += arr[i - 2] + "," + arr[i - 1] + ",";
                } else {
                    result += prev + ",";
                }

                prev = arr[i];
                counter = 0;

            }

        }

        if (counter == 0) {
            result += arr[arr.length - 1];
        } else if (counter == 1) {
            result += arr[arr.length - 2] + "," + arr[arr.length - 1];
        } else {
            result += arr[indexStart] + "-" + arr[arr.length - 1];
        }

        return result;
    }
}
