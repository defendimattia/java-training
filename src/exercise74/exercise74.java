package exercise74;

public class exercise74 {

    public static String addCheckDigit(String number) {

        int sum = 0;

        for (int i = number.length() - 1, j = 0; i >= 0; i--, j++) {
            sum += (number.charAt(i) - '0') * ((j % 6) + 2);
        }

        if (sum % 11 == 1) {
            return number + "X";
        } else {
            return sum % 11 == 0 ? number + 0 : number + (11 - (sum % 11));
        }
    }
}
