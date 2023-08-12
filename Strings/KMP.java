package Strings;
public class KMP {
    static int[] computeWeight(String pattern){
        int []length = new int[pattern.length()];
        int len =0;
        int j=1;
        length[0] = 0;
        while(j<pattern.length()){
            if(pattern.charAt(j) == pattern.charAt(len)){
                len++;
                length[j] = len;
                j++;
            }
            else{
                if(len !=0){
                    len = length[len -1];
                }
                else{
                    length[j] = 0;
                    j++;
                }
            }
        }
        return length;
    }

    static int searchPattern(String text, String pattern, int[] length){
        int i=0;
        int j=0;
        while(i<text.length()){
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
                if(j == pattern.length()){
                    return i -j;
                }
            }

            else{
                if(j!=0){
                    j = length[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "ABCABCDABCCABCD";
        String pattern = "ABCCA";
        int index = searchPattern(text, pattern, computeWeight(pattern));
        System.out.println("FOUND AT INDEX :" + index);
    }
}
