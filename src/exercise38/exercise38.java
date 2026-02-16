package exercise38;

public class exercise38 {

    public static String decode(String morseCode) {

        String result = "";

        for (String word : morseCode.trim().split("   ")) {
            for (String string : word.split(" ")) {
                result += MorseCode.get(string);
            }

            result += " ";
        }
        return result.trim();
    }
}
