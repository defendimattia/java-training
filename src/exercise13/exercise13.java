package exercise13;

public class exercise13 {

    public static String sumStrings(String a, String b) {

        if (a.equals("") && b.equals("")) {
            return "0";
        }

        String result = "";
        String longest = a.length() > b.length() ? a : (a.length() < b.length() ? b : a);
        boolean bool = false;

        for (int index = 0; index < longest.length(); index++) {

            int valueA;
            int valueB;

            try {
                valueA = Integer.parseInt(Character.toString(a.charAt(a.length() - 1 - index)));
            } catch (StringIndexOutOfBoundsException e) {
                valueA = 0;
            }

            try {
                valueB = Integer.parseInt(Character.toString(b.charAt(b.length() - 1 - index)));
            } catch (StringIndexOutOfBoundsException e) {
                valueB = 0;
            }

            int temp = bool ? (valueA + valueB + 1) : (valueA + valueB);

            if (temp > 9) {

                bool = true;
                result = (temp - 10) + result;

            } else {

                bool = false;
                result = temp + result;
            }

        }

        if (bool) {
            result = "1" + result;
        }

        return result.replaceAll("^0+", "");
    }

}
