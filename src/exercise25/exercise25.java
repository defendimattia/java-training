package exercise25;

public class exercise25 {

    public static char findMissingLetter(char[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] + 1) != array[i + 1]) {
                return (char) (array[i] + 1);
            }
        }
        return ' ';
    }
}
