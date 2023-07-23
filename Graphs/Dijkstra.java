import java.util.Arrays;

public class Dijkstra {
    static int[] dijkstra(int graph[][], int v, int source) {
        int dist[] = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        boolean set[] = new boolean[v];
        for(int i = 0; i < v; i++) {
            int u = -1;
            for(int j = 0; j < v; j++) {
                if(!set[j] && (u == -1 || dist[j] < dist[u])) {
                    u = j;
                }
            }
            set[u] = true;
            for(int vertex = 0; vertex < v; vertex++) {
                if(graph[u][vertex] != 0 && set[vertex] == false) {
                    dist[vertex] = Math.min(dist[vertex], graph[u][vertex] + dist[u]);
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int V = 4;
        int graph[][] = {
            {0,5,8,0},
            {5,0,10,15},
            {8,10,0,20},
            {0,15,20,0}
        };
        int source = 0;
        int result[] = dijkstra(graph, V, source);
        for(int i : result) {
            System.out.print(i + ",");
        }
    }
}
