package DynamicProgramming;

public class LCS_Memoization {

    static int lcs_memo(String first, String second, int m, int n, int cache[][]) {
        // Base case
        if(m == 0 || n == 0) {
            return 0;
        }
        if(cache[m-1][n-1] != 0) {
            return cache[m-1][n-1];
        }
        if(first.charAt(m - 1) == second.charAt(n - 1)) {
            cache[m-1][n-1] = 1 + lcs_memo(first, second, m-1, n-1, cache);
        }
        else {
            cache[m-1][n-1] = Math.max(lcs_memo(first, second, m, n-1, cache), 
            lcs_memo(first, second, m-1, n, cache));
        }
        return cache[m-1][n-1];
    }
    public static void main(String[] args) {
        String str_1 = "abcdefg";
        String str_2 = "abxdfg";
        int m = str_1.length();
        int n = str_2.length();
        int cache[][] = new int[m+1][n+1];
        int res = lcs_memo(str_1, str_2,m,n,cache);
        System.out.println(res);
    }
}
