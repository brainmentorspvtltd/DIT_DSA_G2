package Arrays;

import java.util.Arrays;

public class PairSumOptimized {

    // Two pointer approach
    void solution(int arr[], int target) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            if(arr[i] + arr[j] == target) {
                System.out.println("Pair is : " + arr[i] + "," + arr[j]);
            }
            else if(arr[i] + arr[j] < target) {
                i++;
            }
            else if(arr[i] + arr[j] > target) {
                j--;
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
