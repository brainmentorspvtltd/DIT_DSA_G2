package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,6,6,7,7};
        int slide = 4;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i + slide - 1 < arr.length; i++) {
            map = new HashMap<>();
            int k = 0;
            int j = i;
            while(k < slide) {
                if(map.get(arr[j]) == null) {
                    map.put(arr[j], 1);
                }
                else {
                    int f = map.get(arr[j]) + 1;
                    map.put(arr[j], f);
                }
                j++;
                k++;
            }
            System.out.println(map);
            int count = 0;
            for(Map.Entry<Integer, Integer> e : map.entrySet()) {
                // count++;
                if(e.getValue() == 1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
