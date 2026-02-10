package exercise31;

public class exercise31 {

    public static int isSolved(int[][] board) {

        for (int[] line : board) {
            if (line[0] == line[1] && line[1] == line[2] && line[0] != 0) {
                return line[0];
            }
        }

        for (int index = 0; index < 3; index++) {
            if (board[0][index] == board[1][index] && board[1][index] == board[2][index] && board[0][index] != 0) {
                return board[0][index];
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != 0 || board[0][2] == board[1][1]
                && board[1][1] == board[2][0] && board[1][1] != 0) {
            return board[1][1];
        }

        for (int[] line : board) {
            for (int n : line) {
                if (n == 0) {
                    return -1;
                }
            }
        }

        return 0;
    }

}
