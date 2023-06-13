package Recursion;

public class JosephusProblem {
    static int josephus(int n, int k) {
        if(n == 1) {
            return 1;
        }
        else {
            return (josephus(n - 1, k) + k - 1) % n + 1;
        }
    }
    public static void main(String[] args) {
        int output = josephus(9, 2);
        System.out.println(output);
    }
}
