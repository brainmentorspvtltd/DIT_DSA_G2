package Arrays;

public class BarChart {
    static int max(int arr[], int n) {
        int maxElement = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,0,6,5};
        int n = arr.length;
        int maxElement = max(arr, n);
        for(int i=maxElement; i >= 1; i--) {
            for(int j = 0; j < n; j++) {
                if(i <= arr[j]) {
                    System.out.print("*");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
