package Arrays;

public class SecondMax_1 {

   

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,9};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
           if(max < arr[i]) {
                max = arr[i];
           }
        }
        for(int i=0;i<arr.length;i++) {
            if(max != arr[i]) {
                if(secondMax < arr[i] && secondMax < max) {
                secondMax = arr[i];
           }
            }
        }
        System.out.println("the Max Element is : "+max+" and second max is : "+secondMax);

    }

}
