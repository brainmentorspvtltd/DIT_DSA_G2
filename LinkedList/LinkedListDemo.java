package LinkedList;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        n1.next = n2;
        n2.next = n3;
        n3.next = new Node(40);
        n3.next.next = new Node(50);

        Node start = n1;
        while(start != null) {
            System.out.print(start.data + ",");
            start = start.next;
        }

    }
}
