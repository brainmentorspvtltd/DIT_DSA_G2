package Recursion;

public class ClimbStairs {
    
    static int climbStairs(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        else if(n == 2) {
            return 2;
        }
        else {
            return climbStairs(n - 2) + climbStairs(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int result = climbStairs(n);
        System.out.println(result);
    }
}
