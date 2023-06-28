package Arrays;

public class IsArraySorted {
    static void approach_1(int arr[], int n) {
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    System.out.println("Array is not sorted...");
                    return;
                }
            }
        }
    }

    static void approach_2(int arr[], int n) {
        for(int i = 1; i < n; i++) {
            if(arr[i - 1] > arr[i]) {
                System.out.println("Array is not sorted...");
                return;
            }
        }
        System.out.println("Array is sorted...");
    }

    public static void main(String[] args) {
        
    }
}
