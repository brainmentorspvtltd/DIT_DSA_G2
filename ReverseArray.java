package Arrays;

public class ReverseArray {

    // Two pointers approach
    static void reverse(int arr[]) {
        int i = 0, j = arr.length - 1;
        int temp;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7,8,9};
        reverse(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
