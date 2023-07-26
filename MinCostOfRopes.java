import java.util.PriorityQueue;

public class MinCostOfRopes {

    static int mincost(int arr[]){
        PriorityQueue<Integer> minHeap =new PriorityQueue<>();
        for(int i : arr){
            minHeap.offer(i);
        }
        int ans =0;
        while(minHeap.size()!=1){
            int l1 = minHeap.poll();
            int l2 = minHeap.poll();
            int sumLength = l1+ l2;
            ans += sumLength;
            minHeap.offer(sumLength);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={2,3,5,6};
        int ans = mincost(arr);
        System.out.println(ans);
    }
}
