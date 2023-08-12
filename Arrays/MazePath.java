package Arrays;

import java.util.ArrayList;

public class MazePath {
    // Step 1 : Define function and its arguments
    static ArrayList<String> getMaze(int currentRow, int currentCol, int endRow, int endCol) {

        // Positive Base Case : if you reach at the end of grid
        if(currentRow == endRow && currentCol == endCol) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }

        // Negative Base Case  
        if(currentRow > endRow || currentCol > endCol) {
            ArrayList<String> temp = new ArrayList<>();
            return temp;
        }

        ArrayList<String> result = new ArrayList<>();

        // Move one step vertical
        // currentRow + 1        
        ArrayList<String> verticalResult = getMaze(currentRow+1, currentCol, endRow, endCol);
        
        for(String temp : verticalResult) {
            result.add("V" + temp);
        }

        // Move one step horizontal
        // currentCol + 1
        ArrayList<String> horizontalResult = getMaze(currentRow, currentCol+1, endRow, endCol);

        for(String temp : horizontalResult) {
            result.add("H" + temp);
        }
        return result;
        
    }

    public static void main(String[] args) {
        ArrayList<String> res =  getMaze(0, 0, 2, 2);
        System.out.println(res);
    }
}
