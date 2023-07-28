package DynamicProgramming;

public class MCP_Tabulation {
    public static void main(String[] args) {
        int matrix[][] = {
            {2,0,6},
            {3,1,7},
            {4,5,9}
        };
        int result[][] = new int[matrix.length][matrix.length];
        result[0][0] = matrix[0][0];
        // fill the first column
        for(int i = 1; i < result.length; i++) {
            result[i][0] = result[i-1][0] + matrix[i][0];
        }
        // fill the first row
        for(int i = 1; i < matrix.length; i++) {
            result[0][i] = result[0][i-1] + matrix[0][i];
        }
        for(int i = 1; i < result.length; i++) {
            for(int j = 1; j < result.length; j++) {
                result[i][j] = Math.min(Math.min(result[i-1][j-1], result[i-1][j]),
                 result[i][j-1]) + matrix[i][j];
            }
        }
        System.out.println(result[result.length-1][result.length-1]);
    }
}
