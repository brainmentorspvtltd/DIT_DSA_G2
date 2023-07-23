package DynamicProgramming;

public class FibSeries {

    static int fibOne(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int first = fibOne(n - 1);
        int second = fibOne(n - 2);
        int result = first + second;
        return result;
    }

    // Memoization
    static int fib(int n, int []cache) {
        if(n == 0 || n == 1) {
            return n;
        }
        if(cache[n] != 0) {
            return cache[n];
        }
        int first = fib(n - 1, cache);
        int second = fib(n - 2, cache);
        int result = first + second;
        cache[n] = result;
        return result;
    }

    // Tabulation
    static int fibTab(int n, int []cache) {
        cache[0] = 0;
        cache[1] = 1;
        for(int i = 2; i <= n; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[n];
    }

    public static void main(String[] args) {
        int n = 100;

        long start = System.currentTimeMillis();
        int result = fibOne(n);
        long end = System.currentTimeMillis();
        long total = end - start;
        System.out.println("Without DP");
        System.out.println(result + " time taken : " + total);

        int cache[] = new int[n + 1];
        start = System.currentTimeMillis();
        result = fib(n, cache);
        end = System.currentTimeMillis();
        total = end - start;
        System.out.println("With DP");
        System.out.println(result + " time taken : " + total);
        result = fibTab(n, cache);
        System.out.println(result);
    }
}
