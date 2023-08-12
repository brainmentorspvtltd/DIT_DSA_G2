package Arrays;

public class SumN_Natural {
    void fun(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
    }
    void fun_2(int n) {
        int sum = (n * (n + 1)) / 2;
    }

    void fun_3(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                sum++;
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
