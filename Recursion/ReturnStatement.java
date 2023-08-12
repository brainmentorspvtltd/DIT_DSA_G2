package Recursion;

public class ReturnStatement {

    static void func(int n) {
        // Base Case (Terminating case)
        if(n == 0) {
            return;
        }
        // Processing logic
        System.out.println("Recursion Call..."+n);
        // Small Problem
        func(n-1);
    }

    public static void main(String[] args) {
        func(5);
    }
}
