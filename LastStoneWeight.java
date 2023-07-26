import java.util.PriorityQueue;

public class LastStoneWeight {

    static int lastStoneWeight(int []arr){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        for(int i: arr){
            maxHeap.offer(i);
        }

        while(maxHeap.size()!=1){
            int weight1 = maxHeap.poll();
            int weight2 = maxHeap.poll();
            int difference = weight1 - weight2;
            maxHeap.add(difference);
        }
        return maxHeap.poll();
    }
    public static void main(String[] args) {
        int arr[] = {4,2,6,7,1,2};
        System.out.println("ANSWER IS : " + lastStoneWeight(arr));
    }
}
