package Arrays;

public class MaxElement {

    // TC : O(n2)
    static void max(int arr[]) {
        int n = arr.length;
        boolean isMax;
        for(int i = 0; i < n; i++) {
            // consider the current ith element as max element
            isMax = true;
            for(int j = 0; j < n; j++) {
                if(arr[j] > arr[i]) {
                    // found a greater element than current element
                    isMax = false;
                    break;
                }
            }
            if(isMax) {
                System.out.println("Max Element : " + arr[i]);
                return;
            }
        }
    }

    // TC : O(n)
    static void max_2(int arr[]) {
        int n = arr.length;
        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max Element : " + max);
    }

    public static void main(String[] args) {
        
    }
}
