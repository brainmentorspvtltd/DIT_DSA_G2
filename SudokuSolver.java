package Backtracking;

public class SudokuSolver {
    final int MAX_SIZE = 9;
    char[][] board = {
        {'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
    };

    public boolean solver(int row, int col) {

        // if we reach last col, move to the next row
        if(col == MAX_SIZE) {
            row = row + 1;  // increment row by 1
            col = 0;    // reset the column to 0
        }

        // if we reach last row, all cells are filled up, sudoku solved
        // Termination case
        if(row == MAX_SIZE) {
            return true;
        }

        // if cell is not empty then increment col by 1
        if(board[row][col] != '.') {
            solver(row, col + 1);
        }

        // if a cell is empty then we have to put a digits from 1 to 9
        // but we also have to check that it's a safe cell to place a digit
        // so we will check for current row, current col and current grid
        for(int i = 1; i <= MAX_SIZE; i++) {
            char num = (char) (i + '0');
            if(isSafe(row, col, num)) {
                // now if it's safe to place a digit then
                board[row][col] = num;
                // System.out.println("Filled : " + board[row][col]);
                print();
                System.out.println("===============");
                boolean result = solver(row, col + 1);
                if(result) {
                    return true;
                }
                // Now do backtracking
                board[row][col] = '.';
            }
        }
        return false;
    }

    private boolean isPresentInRow(int row, char value) {
        for(int col = 0; col < MAX_SIZE; col++) {
            if(board[row][col] == value) {
                return true;
            }
        }
        return false;
    }

    private boolean isPresentInCol(int col, char value) {
        for(int row = 0; row < MAX_SIZE; row++) {
            if(board[row][col] == value) {
                return true;
            }
        }
        return false;
    }

    private boolean isPresentInGrid(int row, int col, char value) {
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for(int i = startRow; i < startRow + 3; i++) {
            for(int j = startCol; j < startCol + 3; j++) {
                if(board[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isSafe(int row, int col, char value) {
        return !isPresentInRow(row, value) && !isPresentInCol(col, value) && !isPresentInGrid(row, col, value);
    }

    void print() {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + ",");
            }
            System.out.println();
        }
    }

    // public void solveSudoku(char[][] board) {
    //     solver(0, 0);
    // }
    public static void main(String[] args) {
        SudokuSolver obj = new SudokuSolver();
        obj.solver(0, 0);
        
    }
}
