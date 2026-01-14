package exercise5;

public class exercise5 {

    public static String incrementString(String str) {

        char[] array = str.toCharArray();

        if (str.equals("")) {
            return "1";
        }

        if (!Character.isDigit(array[array.length - 1])) {
            return str + "1";

        } else {

            String firstPart = "";
            String numbers = "";
            String numbersIncremented;

            for (int i = array.length - 1; i >= 0; i--) {

                if (Character.isDigit(array[i])) {
                    numbers = array[i] + numbers;
                } else {
                    firstPart = str.substring(0, i + 1);
                    break;
                }
            }

            char[] digits = numbers.toCharArray();
            boolean add = true;

            for (int i = digits.length - 1; i >= 0; i--) {

                if (add == true && digits[i] == '9') {
                    digits[i] = '0';
                } else if (add == true && digits[i] != '9') {
                    digits[i] = (char) ('0' + (digits[i] - '0' + 1));
                    add = false;
                }
            }

            if (add) {
                numbersIncremented = ("1" + String.valueOf(digits));
            } else {
                numbersIncremented = String.valueOf(digits);
            }

            while (numbersIncremented.length() < numbers.length()) {
                numbersIncremented = '0' + numbersIncremented;
            }

            return firstPart + numbersIncremented;
        }
    }
}
