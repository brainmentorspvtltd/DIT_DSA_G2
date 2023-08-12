package Backtracking;

public class NQueen {

    static int countWays(boolean [][]board, int currentRow) {
        int count = 0;
        // add base case to check if we are out of the board
        if(currentRow == board.length) {
            return 1;
        }

        // Traverse all columns of board
        for(int col = 0; col < board[currentRow].length; col++) {
            // check if queen is safe to place
            if(isSafe(board, currentRow, col)) {
                // place the queen on board
                board[currentRow][col] = true;
                // move to the next row once a queen is place in current row
                count += countWays(board, currentRow + 1);
                // this is the backtracking
                board[currentRow][col] = false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean board[][], int row, int col) {
        // check if there is a queen in same column and above row
        for(int i = row; i>= 0; i--) {
            if(board[i][col]) {
                return false;
            }
        }

        // check in upper left diagonal
        for(int i = row, j = col; i >= 0 && j >= 0; i--,j--) {
            if(board[i][j]) {
                return false;
            }
        }

        // check in upper right diagonal
        for(int i = row, j = col; i >= 0 && j < board.length; i--,j++) {
            if(board[i][j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean [][]board = new boolean[4][4];
        int count = countWays(board, 0);
        System.out.println(count);
    }
}
