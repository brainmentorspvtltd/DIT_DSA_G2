package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    static String keys[] = {"", ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static List<String> letterCombinations(String digits) {

        // Termination case
        if(digits.length() == 0) {
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        // Get one digit at a time
        // if digit is "23", then firstchar will store '2'
        char firstChar = digits.charAt(0);
        // convert firstchar into int
        int index = firstChar - '0';
        // currentKey will store element at index i.e., "abc"
        String currentKey = keys[index];
        String remainingString = digits.substring(1);
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < currentKey.length(); i++) {
            List<String> res = letterCombinations(remainingString);
            for(String s : res) {
                ans.add(currentKey.charAt(i) + s);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> op = letterCombinations(digits);
        System.out.println(op);
    }
}
