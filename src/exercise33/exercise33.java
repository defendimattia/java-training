package exercise33;

public class exercise33 {

    public static String[] flapDisplay(final String[] lines, final int[][] rotors) {

        final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";
        String[] result = new String[lines.length];

        for (int l = 0; l < lines.length; l++) {
            int startingPoint = 0;
            String newString = "";
            char[] lineArray = lines[l].toCharArray();

            while (startingPoint < lines[l].length()) {

                for (int i = startingPoint; i < lineArray.length; i++) {
                    char charToChange = lineArray[i];
                    char newChar = ALPHABET.charAt((ALPHABET.indexOf(charToChange) + rotors[l][startingPoint]) % 54);
                    lineArray[i] = newChar;
                }

                newString += lineArray[startingPoint];
                startingPoint += 1;
            }

            result[l] = newString;
        }
        return result;
    }
}
