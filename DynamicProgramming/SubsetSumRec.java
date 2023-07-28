package DynamicProgramming;

public class SubsetSumRec {

    static boolean subset(int arr[], int sum, int n) {
        if(n < 0 || sum < 0) {
            return false;
        }
        // return true if sum becomes 0
        if(sum == 0) {
            return true;
        }
        return subset(arr, sum - arr[n], n-1) || subset(arr, sum, n-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,6,5};
        int sum = 9;
        boolean res = subset(arr, sum, arr.length-1);   
        System.out.println(res);
    }
}
