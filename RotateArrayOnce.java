package Arrays;

public class RotateArrayOnce {

    static void rotateOnce(int arr[]) {
        int n = arr.length;
        int x = arr[n - 1];
        for(int i = n - 1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = x;
    }

    // Two Pointer Approach
    static void rotateOnceP2(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        int temp;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        rotateOnce(arr);
        for(int i : arr) {
            System.out.print(i + ",");
        }
    }
}
