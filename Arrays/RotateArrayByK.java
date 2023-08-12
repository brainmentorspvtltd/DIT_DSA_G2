package Arrays;

public class RotateArrayByK {

    static void approach_1(int arr[], int k) {
        int n = arr.length;
        for(int i = 1; i <= k; i++) {
            int x = arr[n - 1];
            for(int j = n - 1; j > 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = x;
        }
        System.out.println("After rotation : ");
        for(int i : arr) {
            System.out.print(i + ",");
        }
    }

    static void approach_2(int arr[], int k) {
        int n = arr.length;
        // Use extra space
        int temp[] = new int[n];
        for(int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        approach_1(arr, k);
    }
}
