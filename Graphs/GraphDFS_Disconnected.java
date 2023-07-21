import java.util.ArrayList;

public class GraphDFS_Disconnected {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        // for undirected connect u and v and then v and u
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] mark) {
        mark[s] = true;
        System.out.print(s + ",");
        for(int u : adj.get(s)) {
            if(mark[u] == false) {
                DFSRec(adj, u, mark);
            }
        }
    }

    static void DFS(ArrayList<ArrayList<Integer>> adj, int V, int s) {
        boolean[] mark = new boolean[V];
        for(int i = 0; i < V; i++) {
            mark[i] = false;
        }
        for(int i = 0; i < V; i++) {
            if(mark[i] == false) {
                DFSRec(adj, i, mark);
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
