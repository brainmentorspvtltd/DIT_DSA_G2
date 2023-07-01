import java.util.ArrayList;

public class PrintSubsequences {
    public static void main(String[] args) {
        String str = "abcd";
        ArrayList<String> subseqList = new ArrayList<>();

        int n  = str.length();
        for(int i=0;i<n;i++){
            char firstChar = str.charAt(i);
            if(subseqList.size() ==0){
                subseqList.add(" ");
                subseqList.add("" + firstChar);
                continue;
            }
            int subLen = subseqList.size();
            for(int j=0;j<subLen;j++){
                String temp = subseqList.get(j) + firstChar;
                subseqList.add(temp);
            }
        }
        System.out.println("SUBSEQUENCES ARE : " + subseqList);
        
    }
}
