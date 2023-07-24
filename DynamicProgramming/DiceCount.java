package DynamicProgramming;

public class DiceCount {

    static int countWays(int currentValue, int endValue, int cache[]) {
        if(currentValue == endValue) {
            return 1;
        }
        if(currentValue > endValue) {
            return 0;
        }
        if(cache[currentValue] != 0) {
            return cache[currentValue];
        }
        int count = 0;
        for(int dice = 1; dice <= 6; dice++) {
            count = count + countWays(currentValue + dice, endValue, cache);
        }
        cache[currentValue] = count;
        return count;
    }

    static int countWaysTab(int start, int end) {
        int cache[] = new int[end + 1];
        cache[end] = 1;
        for(int i = end - 1; i >= 0; i--) {
            int count = 0;
            for(int dice = 1; dice <= 6 && dice + i < cache.length; dice++) {
                // do sum of last 6 values
                count += cache[dice + i];
            }
            cache[i] = count;
        }
        // return element at 0th index
        return cache[start];
    }

    public static void main(String[] args) {
        int target = 10;
        int cache[] = new int[target+1];
        int output = countWays(0, target, cache);
        System.out.println(output);
        output = countWaysTab(0, target);
        System.out.println(output);
    }
}
