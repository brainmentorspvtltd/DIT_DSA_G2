package Recursion;

public class PermutationTree {

    static void printPerm(String input, String output) {
        // Base Case
        if(input.length() == 0) {
            System.out.println(output);
            return;
        }

        // iterate no of times recursion for each character
        for(int i = 0; i < input.length(); i++) {
            char singleChar = input.charAt(i);
            String remString = input.substring(0, i) + input.substring(i+1);
            printPerm(remString, output + singleChar);
        }
    }

    public static void main(String[] args) {
        printPerm("abc", "");
    }
}
