package Recursion;

import java.util.ArrayList;

public class SubSeqRec {

    static ArrayList<String> solution(String str) {
        if(str.length() == 0) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        }
        // str = "ravi"
        // currentChar = 'r'
        char currentChar = str.charAt(0);
        // remainingString = "avi"
        String remainingString = str.substring(1);
        ArrayList<String> temp = solution(remainingString);
        ArrayList<String> result = new ArrayList<>();
        for(String s : temp) {
            result.add(s);
            result.add(currentChar + s);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "ravi";
        ArrayList<String> output = solution(str);
        System.out.println(output);
    }
}
