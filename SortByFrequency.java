import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortByFrequency {

    static String sortString(String str){
        Map<Character,Integer> hashmap = new HashMap<>();
        for(char c:str.toCharArray()){
            hashmap.put(c, hashmap.getOrDefault(c, 0)+1);
        }

        PriorityQueue<Character> maxheap = new PriorityQueue<>((a,b) -> hashmap.get(b) - hashmap.get(a));
        maxheap.addAll(hashmap.keySet());

        StringBuilder ans = new StringBuilder();
        while(!maxheap.isEmpty()){
            char c = maxheap.poll();
            int freq = hashmap.get(c);
            for(int i=0;i<freq;i++){
                ans.append(c);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str= "leetcode";
        System.out.println(sortString(str));
    }
}
