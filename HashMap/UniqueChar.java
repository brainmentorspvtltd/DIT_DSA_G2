package HashMap;
import java.util.HashMap;

public class UniqueChar {

    static int firstUniqueChar(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c, 0) + 1);
        }

        for(int i=0;i<n ;i++){
            if(map.get(s.charAt(i)) == 1){
                System.out.println("FOUND CHAR :" + s.charAt(i));
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "copyofbook";
        int ans = firstUniqueChar(s);
        System.out.println("AT INDEX :" + ans);
    }
}
