package DynamicProgramming;

public class KnapsackRec {
    static int ks(int []wt, int []val, int max, int index) {
        // if index reach to the end weight or max weight is 0
        if(index == wt.length || max == 0) {
            return 0;
        }
        // if current item weight is greater than so move to the next index
        // do not include that item in bag
        if(wt[index] > max) {
            return ks(wt, val, max, index+1);
        }
        else {
            int option_1 = val[index] + ks(wt, val, max - wt[index], index+1);
            int option_2 = ks(wt, val, max, index+1);
            return Math.max(option_1, option_2);
        }
    }
    public static void main(String[] args) {
        int wt[] = {1,2,2};
        int val[] = {60,100,120};
        int max = 3;
        int result = ks(wt, val, max, 0);
        System.out.println(result);
    }
}
