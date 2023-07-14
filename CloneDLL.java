package LinkedList;
import java.util.*;

class NodeDLL {
    int data;
    NodeDLL next, random;
    NodeDLL(int data) {
        this.data = data;
        next = random = null;
    }
}

public class CloneDLL {

    static void clone(NodeDLL head) {
        HashMap<NodeDLL, NodeDLL> map = new HashMap<>();
        for(NodeDLL current = head; current != null; current = current.next) {
            map.put(current, new NodeDLL(current.data));
        }
        for(NodeDLL current = head; current != null; current = current.next) {
            NodeDLL cloneCurrent = map.get(current);
            cloneCurrent.next = map.get(current.next);
            cloneCurrent.random = map.get(current.random);
        }
        NodeDLL head_2 = map.get(head);
    }

    static void approach_2(NodeDLL start) {
        NodeDLL next, temp;
        for(NodeDLL current = start; current != null; current = current.next) {
            next = current.next;
            current.next = new NodeDLL(current.data);
            current.next.next= next;
        }
        for(NodeDLL current = start; current != null; current = current.next.next){
            current.next.random = current.random != null ? current.random.next : null;
        }
        NodeDLL old_pointer = start;
        NodeDLL new_pointer = start.next;
        NodeDLL old_head = start.next;
        while(old_pointer != null) {
            old_pointer.next = old_pointer.next.next;
            new_pointer.next = new_pointer.next != null ? new_pointer.next.next : null;
            old_pointer = old_pointer.next;
            new_pointer = new_pointer.next;
        }
        // return old_head;
    }

    public static void main(String[] args) {

    }
}
