package DynamicProgramming;

public class LCS_Tabulation {
    static int lcs_tab(String first, String second, int m, int n) {
        int matrix[][] = new int[m+1][n+1];
        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                if(i == 0 || j == 0) {
                    matrix[i][j] = 0;
                }
                else {
                    if(first.charAt(i-1) == second.charAt(j-1)) {
                        // increment the value of diagonal by 1 and store it
                        matrix[i][j] = matrix[i-1][j-1] + 1;
                    }
                    else {
                        matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                    }
                }
            }
        }
        return matrix[m][n];
    }
    public static void main(String[] args) {
        String str_1 = "abcdefg";
        String str_2 = "abxdfg";
        int m = str_1.length();
        int n = str_2.length();
        int res = lcs_tab(str_1, str_2, m, n);
        System.out.println(res);
    }
}
