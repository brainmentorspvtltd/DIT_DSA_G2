package Arrays;

public class SnakePattern {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4}, 
            {5,6,7,8}, 
            {4,5,3,1}, 
            {6,8,9,4}
        };
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + ",");
                }
            }
            else {
                for(int j = arr[i].length; j >= 0; j--) {
                    System.out.print(arr[i][j] + ",");
                }
            }
        }
    }
}
