package DynamicProgramming;

public class LCS_Recursion {

    static int lcs(String first, String second) {
        if(first.length() == 0 || second.length() == 0) {
            return 0;
        }
        int count = 0;
        if(first.charAt(0) == second.charAt(0)) {
            count = 1 + lcs(first.substring(1), second.substring(1));
        }
        else {
            int result_1 = lcs(first.substring(1), second);
            int result_2 = lcs(first, second.substring(1));
            count = Math.max(result_1, result_2);
        }
        return count;
    }

    public static void main(String[] args) {
        String str_1 = "abcdefg";
        String str_2 = "abxdfg";
        int res = lcs(str_1, str_2);
        System.out.println(res);
    }
}
