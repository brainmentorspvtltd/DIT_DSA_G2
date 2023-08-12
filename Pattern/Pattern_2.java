package Pattern;

public class Pattern_2 {

    static void printStar(int noOfStar) {
        // Base Case
        if(noOfStar == 0) {
            return;
        }
        // Processing Logic
        System.out.print("*");
        // Small Problem
        printStar(noOfStar - 1);
    }

    static void printPattern(int rows, int currentRow) {
        if(rows == 0) {
            return;
        }
        printStar(currentRow);  // print the row
        System.out.println();   // move to the new line
        printPattern(rows-1, currentRow-1);
    }

    public static void main(String[] args) {
        printPattern(5, 5);
    }
}
