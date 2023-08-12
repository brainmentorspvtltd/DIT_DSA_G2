package LinkedList;
public class Factorial {

    static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        return fact(n - 1) * n;
    }

    public static void main(String[] args) {
        int result = fact(5);        
        System.out.println(result);
    }
}
