package Recursion;

public class FibSeries {
    static int fib(int n) {
        // Base Case
        if(n <= 1) {
            return n;
        }
        int first = fib(n-1);
        int second = fib(n-2);
        int result = first + second;
        return result;
    }
    public static void main(String[] args) {
        fib(5);
    }
}
