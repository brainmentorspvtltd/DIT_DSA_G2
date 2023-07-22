import java.util.Arrays;

public class Prims {

    static int prims(int graph[][], int v) {
        int dist[] = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        boolean set[] = new boolean[v];
        int result = 0;
        for(int i = 0; i < v; i++) {
            int source = -1;
            for(int j = 0; j < v; j++) {
                if(!set[j] && (source == -1 || dist[j] < source)) {
                    source = j;
                }
            }
            set[source] = true;
            result += dist[source];
            for(int vertex = 0; vertex < v; vertex++) {
                if(graph[source][vertex] != 0 && set[vertex] == false) {
                    dist[vertex] = Math.min(dist[vertex], graph[source][vertex]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int V = 4;
        int graph[][] = {
            {0,5,8,0},
            {5,0,10,15},
            {8,10,0,20},
            {0,15,20,0}
        };
        int result = prims(graph, V);
        System.out.println(result);
    }
}
