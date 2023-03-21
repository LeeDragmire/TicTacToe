public class TicTacToeBoard {

    public int[][] board() {
        int[][] board = new int[3][3];
    }

    public boolean isValidMove(int r, int c) {
        if (board()[r][c] == 1 || board()[r][c] == 2) {
            return false;
        } else {
            return true;
        }
    }

    public void makeMove(int r, int c, int player) {
        if (player == 1 && isValidMove(r,c)) {
            board()[r][c] = 1;
        }
        if (player == 2 && isValidMove(r,c)) {
            board()[r][c] = 2;
        }
        if (!isValidMove(r, c)) {
            System.out.print("That spot is already taken, please make another move.");
        }
    }

    public int getGameStatus() {
        if ((board()[0][0] == 1 && board()[0][1] == 1))
    }

    public int getCellContents(int r, int c) {

    }
}