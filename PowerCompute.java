package Recursion;

public class PowerCompute {

    static int powerUsingLoop(int n, int pow) {
        int result = 1;
        for(int i = 1; i <= pow; i++) {
            result = result * n;
        }
        return result;
    }

    static int powerUsingRec(int n, int pow) {
        if(pow == 0) {
            return 1;
        }
        int res = powerUsingRec(n, pow - 1);
        res = res * n;
        return res;
    }

    public static void main(String[] args) {
        int n = 2;
        int pow = 5;
        System.out.println(powerUsingLoop(n, pow));
        System.out.println(powerUsingRec(n, pow));
    }
}
