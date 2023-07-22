import java.util.ArrayList;

public class CycleDetection {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        // for undirected connect u and v and then v and u
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static boolean DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] mark, int parent) {
        mark[s] = true;
        // System.out.print(s + ",");
        for(int u : adj.get(s)) {
            if(mark[u] == false) {
                if(DFSRec(adj, u, mark, -1) == true) {
                    return true;
                }
            }
            else if(u != parent) {
                return true;
            }
        }
        return false;
    }

    static boolean DFS(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] mark = new boolean[V];
        for(int i = 0; i < V; i++) {
            mark[i] = false;
        }
        for(int i = 0; i < V; i++) {
            if(mark[i] == false) {
                if(DFSRec(adj, V, mark, i) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
}
