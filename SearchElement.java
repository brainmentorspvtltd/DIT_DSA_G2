package Recursion;

public class SearchElement {

    static int search(int arr[], int index, int num) {
        if(arr.length-1 == index) {
            return -1;
        }
        if(arr[index] == num) {
            return index;
        }
        return search(arr, index+1, num);
    }

    public static void main(String[] args) {
        int arr[] = {10,5,7,8,16};
        int num = 7;
        int index = search(arr, 0, num);
        System.out.println(index);
    }
}
