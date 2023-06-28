package Arrays;

import java.util.HashMap;

public class PairSum {

    static void approach_1(int arr[], int target) {
        int sum = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if(sum == target) {
                    System.out.println("Pair is : " + i + "," + j);
                    return;
                }
            }
        }
    }

    static void approach_2(int arr[], int target) {
        // TC : O(n)
        // SC : O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int e : arr) {
            if(map.get(e) == null) {
                map.put(target - e, e);
            }
            else {
                System.out.println(map.get(e) + "," + e);
                break;
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
