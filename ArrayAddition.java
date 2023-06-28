package Arrays;

public class ArrayAddition {
    public static void main(String[] args) {
        int arr_1[] = {2,1,8,9};
        int arr_2[] = {2,1,2,7};
        int n1 = arr_1.length;
        int n2 = arr_2.length;
        int n3 = n1 > n2 ? n1 : n2;
        int result[] = new int[n3 + 1];
        int carry = 0;
        int sum = 0;
        int i = n1 - 1;
        int j = n2 - 1;
        int k = n3;
        while(k > 0)  {
            if(i >= 0 && j >= 0) {
                sum = arr_1[i] + arr_2[j] + carry;
            }
            else if(i >= 0 && j < 0) {
                sum = arr_1[i] + carry;
            }
            else if(j >= 0 && i < 0) {
                sum = arr_2[j] + carry;
            }
            carry = sum / 10;
            sum = sum % 10;
            result[k] = sum;
            i--;
            j--;
            k--;
        }
        if(carry != 0) {
            result[0] = carry;
            // System.out.print(carry + " ");
        }
        for(int r : result) {
            System.out.print(r + " ");
        }
    }
}
