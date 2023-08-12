package Recursion;

import java.util.ArrayList;

public class SubSeqIter {

    static ArrayList<String> solution(String str) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(list.size() == 0) {
                list.add("");
                // "" + currentChar - because currentChar data type is char
                // and our list can store only String type of data
                // so after concatenation it will become String type of daya
                list.add("" + currentChar);
                continue;
            }
            int n = list.size();
            for(int j = 0; j < n; j++) {
                String temp = list.get(j) + currentChar;
                if(!list.contains(temp)) {
                    list.add(temp);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String str = "ravi";
        ArrayList<String> output = solution(str);
        System.out.println(output);
    }
}
