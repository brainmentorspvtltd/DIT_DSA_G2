package Recursion;

public class SumOfDigit {

    static int sumUsingLoop(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    static int sumUsingRec(int n, int sum) {
        // Terminating case
        if(n == 0) {
            return sum;
        }
        // Processing Logic
        sum += n % 10;
        // Small Problem
        n = n / 10;
        return sumUsingRec(n, sum);
    }

    public static void main(String[] args) {
        // System.out.println(sumUsingLoop(242461));
        System.out.println(sumUsingRec(242461, 0));
    }
}
