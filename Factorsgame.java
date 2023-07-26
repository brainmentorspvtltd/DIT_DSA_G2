import java.util.PriorityQueue;

public class Factorsgame {

    static int func(int n){
        PriorityQueue<Integer> minHeap =new PriorityQueue<>();
        minHeap.add(1);
        for(int i=1;i<n;i++){
            int current = minHeap.poll();
            while(!minHeap.isEmpty() && minHeap.peek() == current){
                current = minHeap.poll();
            }
            minHeap.add(current*2);
            minHeap.add(current *3);
            minHeap.add(current *5);
        }
        return minHeap.poll();
    }
    public static void main(String[] args) {
        int n =15;
        System.out.println("NUMBER IS : " + func(n));
    }
}
