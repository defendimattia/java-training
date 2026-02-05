package exercise26;

public class exercise26 {

    public static String workOnStrings(String a, String b) {

        char[] newA = a.toCharArray();
        char[] newB = b.toCharArray();

        for (int i = 0; i < newA.length; i++) {
            if (b.toLowerCase().contains(Character.toString(newA[i]).toLowerCase())) {
                if (b.replaceAll("[^" + Character.toLowerCase(newA[i]) + Character.toUpperCase(newA[i]) + "]", "")
                        .length() % 2 == 1) {
                    newA[i] = Character.isUpperCase(newA[i]) ? Character.toLowerCase(newA[i])
                            : Character.toUpperCase(newA[i]);
                }

            }
        }

        for (int i = 0; i < newB.length; i++) {
            if (a.toLowerCase().contains(Character.toString(newB[i]).toLowerCase())) {
                if (a.replaceAll("[^" + Character.toLowerCase(newB[i]) + Character.toUpperCase(newB[i]) + "]", "")
                        .length() % 2 == 1) {
                    newB[i] = Character.isUpperCase(newB[i]) ? Character.toLowerCase(newB[i])
                            : Character.toUpperCase(newB[i]);
                }

            }
        }

        return new String(newA) + new String(newB);
    }
}
