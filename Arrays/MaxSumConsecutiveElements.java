package Arrays;

public class MaxSumConsecutiveElements {
    static void approach_1(int arr[], int k) {
        int maxSum = 0;
        for(int i = 0; i + k - 1 < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < k; j++) {
                sum += arr[i + j];
            }
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println("Max Sum : " + maxSum);
    }

    // Using window sliding technique
    static void approach_2(int arr[], int k) {
        int slideSum = 0;
        int maxSum = 0;
        // sum of first k elements
        for(int i = 0; i < k; i++) {
            slideSum = slideSum + arr[i];
        }
        maxSum = slideSum;
        for(int i = k; i < arr.length; i++) {
            slideSum = slideSum + arr[i] - arr[i - k];
            if(slideSum > maxSum) {
                maxSum = slideSum;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,40,30,10,20,5};
        int k = 3;
        
    }
}
