package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class SmallerNumber {
    static int[] bruteForce(int arr[]) {
        int n = arr.length;
        int count = 0;
        int output[] = new int[n];
        for(int i = 0; i < arr.length; i++) {
            count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    count++;
                }
            }
            output[i] = count;
        }
        return output;
    }

    // Approach - 2 (Use Sorting) : TC:O(nlogn)
    // After sorting arr : [1,2,2,3,8]
    static int[] approach_2(int arr[]) {
        int n = arr.length;
        // [8,1,2,2,3]
        int org[] = arr.clone();    // keep the clone in org variable
        Arrays.sort(arr);   // [1,2,2,3,8]
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            map.putIfAbsent(arr[i], i);
        }
        int output[] = new int[n];
        for(int i = 0; i < org.length; i++) {
            output[i] = map.get(org[i]);
        }
        // System.out.println(map);
        return output;
    }

    static int[] approach_3(int[] arr) {
        int n = arr.length;
        int hash[] = new int[101];
        int output[] = new int[n];
        for(int i = 0; i < arr.length; i++) {
            if(hash[arr[i]] == 0) {
                hash[arr[i]] = 1;
            }
            else {
                hash[arr[i]] += 1;
            }
        }

        // for(int i : hash) {
        //     System.out.print(i + ",");
        // }
        // System.out.println();
        // System.out.println("==========");

        // Prefix Sum Array
        for(int i = 1; i < hash.length; i++) {
            int prev = hash[i-1];
            int curr = hash[i];
            hash[i] = prev + curr;
        }

        // for(int i : hash) {
        //     System.out.print(i + ",");
        // }

        for(int i = 0; i < arr.length; i++) {
            output[i] = hash[arr[i]-1];
        }

        return output;
    }


    public static void main(String[] args) {
        int arr[] = {8,1,2,2,3};
        // int output[] = bruteForce(arr);
        // for(int i : output) {
        //     System.out.print(i + ",");
        // }
        // int output[] = approach_2(arr);
        // for(int i : output) {
        //     System.out.print(i + ",");
        // }

        int output[] = approach_3(arr);
        for(int i : output) {
            System.out.print(i + ",");
        }
    }
}
