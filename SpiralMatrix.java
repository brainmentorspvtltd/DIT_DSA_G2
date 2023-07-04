package Arrays2D;

public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,5},
            {4,6,7,1},
            {1,5,8,2},
            {5,6,8,9}
        };
        // number of rows
        int m = arr.length;
        // number of cols
        int n = arr[0].length;
        // start row index
        int k = 0;
        // start col index
        int l = 0;
        int i;
        while(k < m && l < n) {
            // print rows (first row)
            for(i = l; i < n; i++) {
                System.out.print(arr[k][i] + ",");
            }
            k++;
            // print cols (last col)
            for(i = k; i < m; i++) {
                System.out.print(arr[i][n-1] + ",");
            }
            n--;
            // print last row
            if(k < m) {
                for(i = n - 1; i >= l; i--){
                    System.out.print(arr[m-1][i] + ",");
                }
                m--;
            }
            if(l < n) {
                for(i = m - 1; i >= k; i--) {
                    System.out.print(arr[i][l] + ",");
                }
                l++;
            }
        }
    }
}
