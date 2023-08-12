package Recursion;

import java.util.ArrayList;

public class Permutation {

    static ArrayList<String> perm(String str) {
        if(str.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // currentChar - a,b,c
        char currentChar = str.charAt(0);
        String remaningString = str.substring(1);
        ArrayList<String> temp = perm(remaningString);
        ArrayList<String> result = new ArrayList<>();
        for(String s : temp) {
            for(int i = 0; i <= s.length(); i++) {
                StringBuffer sb = new StringBuffer(s);
                sb.insert(i, currentChar);
                result.add(sb.toString());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> result = perm(str);
        System.out.println(result);
    }
}
