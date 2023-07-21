import java.util.ArrayList;
import java.util.LinkedList;

public class GraphBFSDisconnected {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        // for undirected connect u and v and then v and u
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void bfs(ArrayList<ArrayList<Integer>> adj, int s, boolean []visited) {
        visited[s] = true;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);
        while(queue.size() != 0) {
            // pop front element of queue
            int u = queue.poll();
            System.out.print(u + ",");
            // get number of adjacent vertices of current source
            int size = adj.get(u).size();
            for(int i = 0; i < size; i++) {
                // get adjacent node
                int adjNode = adj.get(u).get(i);
                // check if adj node is visited or not
                if(visited[adjNode] == false) {
                    visited[adjNode] = true;
                    queue.add(adjNode);
                }
            }
        }        
    }

    static void bfsDisconnected(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean []visited = new boolean[V+1];
        for(int i = 1; i < V + 1; i++) {
            visited[i] = false;
        }
        for(int i = 0; i < V; i++) {
            if(visited[i] == false) {
                bfs(adj, i, visited);
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
