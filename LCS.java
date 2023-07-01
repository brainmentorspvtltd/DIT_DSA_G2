import java.util.ArrayList;
import java.util.List;

public class LCS {

    static String lcs(String str1, String str2){
        List<String> list1 = generateSubsequences(str1);
        List<String> list2 = generateSubsequences(str2);

        String lcs="";
        for(String word1 : list1){
            for(String word2 : list2){
                if(word1.equals(word2) && word1.length() > lcs.length()){
                    lcs = word1;
                }
            }
        }
        return lcs;
    }

    static List<String> generateSubsequences(String str){
        ArrayList<String> subseqList = new ArrayList<>();

        int n  = str.length();
        for(int i=0;i<n;i++){
            char firstChar = str.charAt(i);
            if(subseqList.size() ==0){
                subseqList.add("");
                subseqList.add("" + firstChar);
                continue;
            }
            int subLen = subseqList.size();
            for(int j=0;j<subLen;j++){
                String temp = subseqList.get(j) + firstChar;
                subseqList.add(temp);
            }
        }
        return subseqList;
    }
    public static void main(String[] args) {
        String str1 ="ayc";
        String str2 ="abc";
        String ans = lcs(str1, str2);
        System.out.println("LONGEST COMMON SUBSEQUENCE IS : "+ ans);
    }
}
