package exercise20;

public class VigenereCipher {

    private String abc = "abcdefghijklmnopqrstuvwxyz";
    private String key = "password";

    public VigenereCipher(String key, String abc) {
        this.key = key;
        this.abc = abc;
    }

    public String encode(String str) {

        char[] array = str.toCharArray();
        String result = "";

        for (int i = 0; i < array.length; i++) {

            if (!this.abc.contains(Character.toString(array[i]))) {
                result += array[i];
            } else {
                int start = this.abc.indexOf(array[i]);
                int increment = this.abc.indexOf(key.charAt(i % key.length()));

                result += abc.charAt((start + increment) % abc.length());
            }

        }

        return result;
    }

    public String decode(String str) {

        char[] array = str.toCharArray();
        String result = "";

        for (int i = 0; i < array.length; i++) {

            if (!this.abc.contains(Character.toString(array[i]))) {
                result += array[i];
            } else {
                int start = this.abc.indexOf(array[i]);
                int decrement = this.abc.indexOf(key.charAt(i % key.length()));

                result += abc.charAt(((start - decrement) + abc.length()) % abc.length());
            }

        }

        return result;
    }

}