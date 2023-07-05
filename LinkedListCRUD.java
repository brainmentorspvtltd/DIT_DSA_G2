package LinkedList;

public class LinkedListCRUD<T> {
    private NodeA<T> start;

    void insertAtBeg(NodeA<T> node) {
        // linked list is empty
        if(start == null) {
            start = node;
            return;
        }
        node.next = start;
        start = node;
    }

    void print() {
        NodeA<T> temp = start;
        while(temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListCRUD<Integer> obj = new LinkedListCRUD<>();
        obj.insertAtBeg(new NodeA<>(2));
        obj.insertAtBeg(new NodeA<>(6));
        obj.insertAtBeg(new NodeA<>(8));
        obj.insertAtBeg(new NodeA<>(10));
        obj.print();
    }
}
