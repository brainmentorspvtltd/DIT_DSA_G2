package Arrays2D;

public class ToeplitzMatrix {
    static boolean check(int matrix[][]) {
        for(int i = 0; i < matrix.length - 1; i++) {
            for(int j = 0; j < matrix[i].length - 1; j++) {
                if(matrix[i][j] != matrix[i+1][j+1]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,1,2,3},
            {4,5,1,2},
        };
        boolean result = check(matrix);
        System.out.println(result);
    }
}
