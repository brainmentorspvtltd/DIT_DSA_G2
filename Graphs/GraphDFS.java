import java.util.ArrayList;

public class GraphDFS {

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
        DFSRec(adj, s, mark);
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 3, 4);
        DFS(adj, V, 0);
    }
}
