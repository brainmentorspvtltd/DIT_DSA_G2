package Arrays;

public class MajorityElement {
    static int approach_1(int arr[], int n) {
        int majorityCount = n/2;
        for(int num : arr) {
            int count = 0;
            for(int elem : arr) {
                if(elem == num) {
                    count += 1;
                }
            }
            if(count > majorityCount) {
                return num;
            }
        }
        return -1;
    }

    // Using Hashmap

    // Optimized Approach - Boyer Moore's Voting Algorithm
    int approach_3(int arr[], int n) {
        int count = 0;
        int majorityElement = 0;
        for(int i = 0; i < n; i++) {
            if(count == 0) {
                majorityElement = arr[i];
            }
            if(majorityElement == arr[i]) {
                count++;
            }
            else {
                count--;
            }
        }
        count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == majorityElement) {
                count++;
            }
        }
        int ans = count > n/2 ? majorityElement : -1;
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,2,1,1,2,2,2,2};
        int n = arr.length;
        approach_1(arr, n);
    }
}
