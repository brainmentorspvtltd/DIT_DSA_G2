package Arrays;

public class NBonacciSeries {
    public static void main(String[] args) {
        int slide = 3;
        int nthTerm = 15;
        int arr[] = new int[nthTerm];
        for(int i = 0; i < slide - 1; i++) {
            arr[i] = 0;
        }
        arr[slide - 1] = 1;
        int start = -1;
        int second = 0;
        for(int i = slide; i < arr.length - 1; i++) {
            if(start != -1) {
                second = arr[i-1] - arr[start];
                arr[i] = arr[i-1] + second;
            }
            else {
                arr[i] = arr[i-1];
            }
            start++;
        }
        for(int e : arr) {
            System.out.print(e + ",");
        }
    }
}
