package Recursion;

public class MazePathWithoutArrayList {

    static void printMaze(int currentRow, int endRow, int currentCol, int endCol, String output) {
        if(currentRow == endRow && currentCol == endCol) {
            System.out.println(output);
            return;
        }
        if(currentRow > endRow || currentCol > endCol) {
            return;
        }
        printMaze(currentRow + 1, endRow, currentCol, endCol, output + "V");
        printMaze(currentRow, endRow, currentCol+1, endCol, output + "H");
    }

    public static void main(String[] args) {
        printMaze(0, 2, 0, 2, "");
    }
}
