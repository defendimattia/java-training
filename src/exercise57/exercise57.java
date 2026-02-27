package exercise57;

public class exercise57 {

    public static int[] findMine(int[][] field) {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 1) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}
