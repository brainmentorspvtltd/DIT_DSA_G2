package Recursion;

public class ReturnStatement {

    static void func(int n) {
        // Base Case
        if(n == 0) {
            return;
        }
        System.out.println("Recursion Call..."+n);
        func(n-1);
    }

    public static void main(String[] args) {
        func(5);
    }
}
