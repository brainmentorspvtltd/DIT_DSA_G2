package Recursion;

public class IsArraySorted {

    static boolean isSorted(int arr[], int index) {
        // Termination Case
        if(arr.length-1 == index) {
            return true;
        }
        if(arr[index] > arr[index + 1]) {
            return false;
        }
        // Small Problem
        return isSorted(arr, index+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,5,8,9};
        boolean result = isSorted(arr, 0);
        System.out.println(result);
    }
}
