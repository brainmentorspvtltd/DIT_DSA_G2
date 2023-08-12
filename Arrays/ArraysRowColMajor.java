package Arrays2D;

public class ArraysRowColMajor {
    public static void main(String[] args) {
        // int x[][] = new int[3][3];
        // int [][]x = new int[3][3];
        // int []x[] = new int[3][3];
        int x[][] = {
            {1,2,3},
            {5,6,7},
            {7,8,9}};
        // Access data in row major
        for(int i =  0; i < x.length; i++) {
            for(int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + ",");
            }
            System.out.println();
        }
        
        System.out.println("======");

        // Access data in col major
        for(int i =  0; i < x.length; i++) {
            for(int j = 0; j < x[i].length; j++) {
                System.out.print(x[j][i] + ",");
            }
            System.out.println();
        }


    }
}
