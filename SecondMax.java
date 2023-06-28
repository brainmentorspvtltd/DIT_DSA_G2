package Arrays;

public class SecondMax {
    static void secondMax(int arr[]) {
        int n = arr.length;
        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int secondMax = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] != max) {
                if(arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("Second max : " + secondMax);
    }

    static void secondMax_2(int arr[]) {
        int n = arr.length;
        int max = arr[0];
        int secondMax = -1;
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] != max) {
                if(arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("Second max : " + secondMax);
    }



    public static void main(String[] args) {
        int arr[] = {3,4,7,8,2,6};
        secondMax_2(arr);
    }
}
