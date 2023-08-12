package Backtracking;

public class SubsetSum {

    static boolean isSubsetSum(int N, int arr[], int sum) {
        if(sum == 0) {
            return true;
        }
        if(N == 0) {
            return false;
        }
        if(arr[N-1] <= sum) {
            // Include the sum
            return isSubsetSum(N-1, arr, sum - arr[N-1]) || isSubsetSum(N-1, arr, sum);
        }
        else {
            // Exclude the sum
            return isSubsetSum(N-1, arr, sum);
        }        
    }

    public static void main(String[] args) {
        
    }
}
