import java.util.HashMap;
import java.util.Map;

class Vertex {
    HashMap<Integer, Integer> neighbours = new HashMap<>();
}

public class GraphUsingHashmap {

    HashMap<Integer, Vertex> vertices = new HashMap<>();
    void addVertex(int v) {
        Vertex vertex = new Vertex();
        vertices.put(v, vertex);
    }

    boolean isEdgeExist(int firstVertex, int secondVertex) {
        Vertex first = vertices.get(firstVertex);
        Vertex second = vertices.get(secondVertex);
        if(first == null || second == null || !first.neighbours.containsKey(secondVertex)) {
            return false;
        }
        return true;
    }

    void addEdge(int firstVertex, int secondVertex, int weight) {
        if(isEdgeExist(firstVertex, secondVertex)) {
            System.err.println("Edge Already Present...");
            return;
        }
        Vertex first = vertices.get(firstVertex);
        Vertex second = vertices.get(secondVertex);
        first.neighbours.put(secondVertex, weight);
        second.neighbours.put(firstVertex, weight);
    }

    void print() {
        for(Map.Entry<Integer, Vertex> currentVertex : vertices.entrySet()) {
            System.out.println(currentVertex.getKey() + " => " + currentVertex.getValue().neighbours);
        }
    }

    public static void main(String[] args) {
        GraphUsingHashmap obj = new GraphUsingHashmap();
        obj.addVertex(1);
        obj.addVertex(2);
        obj.addVertex(3);
        obj.addVertex(4);

        obj.addEdge(1, 2, 0);
        obj.addEdge(2, 3, 0);
        obj.addEdge(3, 4, 0);
        obj.addEdge(1, 4, 0);

        obj.print();

    }
}
