public class TicTacToeBoard {
    private int[][] board;
    
    public TicTacToeBoard() {
        int[][] board = new int[][] {
            {0, 0, 0},
            {0, 0, 0}, 
            {0, 0, 0}};
        this.board = board;
    }

    public boolean isValidMove(int r, int c) {
        if (board[r][c] == 1 || board[r][c] == 2) {
            return false;
        } else {
            return true;
        }
    }

    public void makeMove(int r, int c, int player) {
        if (!isValidMove(r, c)) {
            System.out.print("That spot is already taken, please make another move.");
        }
        if (player == 1 && isValidMove(r,c)) {
            board[r][c] = 1;
        }
        if (player == 2 && isValidMove(r,c)) {
            board[r][c] = 2;
        }
    }

    public int getGameStatus() {
        if ((board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1)
         || (board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1)
          || (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1)
          || (board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1)
          || (board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1)
          || (board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1)
          || (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) ||
          (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1)) {
            return 1;
          } else if ((board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2)
          || (board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2)
           || (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2)
           || (board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2)
           || (board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2)
           || (board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2)
           || (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) ||
           (board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 2)) {
             return 2;
           }
        int tie = 0;
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (!isValidMove(r, c)) {
                    tie++;
                }
            }
        }
        if (tie == 9) {
            return -1;
        } else {
            return 0;
        }

    }

    public int getCellContents(int r, int c) {
        if (board[r][c] == 1) {
            return 1;
        } else if (board[r][c] == 2) {
            return 2;
        } else {
            return 0;
        }
    }

    public int[][] getBoard() {
        return board;
    }

    public int winCords(int[][] board) {
        board = getBoard();
        int result = 0;
        if (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1) {
            result = 1;
        } else if (board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1) {
            result = 2;
        } else if (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1) {
            result = 3;
        } else if (board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1) {
            result = 4;
        } else if (board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1) {
            result = 5;
        } else if (board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1) {
            result = 6;
        } else if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) {
            result = 7;
        } else if (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1) {
            result = 8;
        } 

        else if (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2) {
            result = 1;
        } else if (board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2) {
            result = 2;
        } else if (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2) {
            result = 3;
        } else if (board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2) {
            result = 4;
        } else if (board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2) {
            result = 5;
        } else if (board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2) {
            result = 6;
        } else if (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) {
            result = 7;
        } else if (board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 2) {
            result = 8;
        } 
        return result;
    }
}
/* In winCords
 *  1 = top left     [0,0]
 *  2 = top mid      [0,1]
 *  3 = top right    [0,2]
 *  4 = middle left  [1,0]
 *  5 = center       [1,1]
 *  6 = middle right [1,2]
 *  7 = bottom left  [2,0]
 *  8 = bottom mid   [2,1]
 *  9 = bottom right [2,2]
 * 
 *  ex: if winCords == {1,3}, the winning points = top left and top right, straight across the top win
 */