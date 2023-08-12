package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    static List<Integer> solution(int arr[][]) {
        List<Integer> minRow = new ArrayList<>();
        List<Integer> maxCol = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int minRowE = Integer.MAX_VALUE;
        int maxColE = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                minRowE = Math.min(minRowE, arr[i][j]);
            }
            minRow.add(minRowE);
            minRowE = Integer.MAX_VALUE;
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                maxColE = Math.max(maxColE, arr[j][i]);
            }
            maxCol.add(maxColE);
            maxColE = Integer.MIN_VALUE;
        }

        for(int each : minRow) {
            if(maxCol.contains(each)) {
                result.add(each);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int matrix[][] = {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> ans = solution(matrix);
        System.out.println(ans);
    }
}
