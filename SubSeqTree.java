package Recursion;

public class SubSeqTree {

    static void printSubSeq(String str, String result) {

        if(str.length() == 0) {
            System.out.print(result + ",");
            return;
        }

        // result is used to store results for printing
        // assume the string is "abc"
        // "abc" - 'a'
        char singleChar = str.charAt(0);
        
        // get the remaining string
        // "abc" - "bc"
        String remainingString = str.substring(1);
        printSubSeq(remainingString, result);
        printSubSeq(remainingString, result + singleChar);
    }

    public static void main(String[] args) {
        printSubSeq("abc", "");
    }
}
