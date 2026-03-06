package exercise69;

public class exercise69 {

    public static boolean isValid(char[] walk) {

        if (walk.length == 10) {
            int counter = 0;

            for (char c : walk) {
                switch (c) {
                    case 'n':
                        counter += 3;
                        break;
                    case 's':
                        counter -= 3;
                        break;
                    case 'e':
                        counter += 5;
                        break;
                    case 'w':
                        counter -= 5;
                        break;
                }
            }

            if (counter == 0) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
}
