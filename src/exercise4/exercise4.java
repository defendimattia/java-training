package exercise4;

public class exercise4 {

    public static String rot13(String str) {

        char[] array = str.toCharArray();
        String result = "";

        for (char c : array) {
            
            if (Character.isLetter(c)) {

                int charToRot13 = (int) c + 13;

                if ((Character.isUpperCase(c) && charToRot13 > 90) || (Character.isLowerCase(c) && charToRot13 > 122)) {
                    charToRot13 -= 26;
                }

                result += (char) charToRot13;

            } else {
                result += c;
            }
        }

        return result;
    }

}
