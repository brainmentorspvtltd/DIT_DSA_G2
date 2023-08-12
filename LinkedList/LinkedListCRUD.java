package LinkedList;

public class LinkedListCRUD<T> {
    private NodeA<T> start;

    int getCount() {
        NodeA<T> temp = start;
        int counter = 0;
        while(temp != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }

    void insertAtBeg(NodeA<T> node) {
        // linked list is empty
        if(start == null) {
            start = node;
            return;
        }
        node.next = start;
        start = node;
    }

    void insertAtEnd(NodeA<T> node) {
        // If Linked List is Empty
        if(start == null) {
            start = node;
            return;
        }
        // If Linked List has only one node
        if(start.next == null) {
            start.next = node;
            return;
        }

        NodeA<T> temp = start;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    void insertAtMid(NodeA<T> node, int pos) {
        // If Linked List is Empty
        if(start == null) {
            start = node;
            return;
        }
        if(pos == 0) {
            insertAtBeg(node);
            return;
        }
        if(pos > getCount()) {
            throw new RuntimeException("Position is invalid...");
        }

        if(pos >= 1) {
            int i = 1;
            NodeA<T> temp = start;
            while(i < pos) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    void deleteAtBeg() {
        if(start == null) {
            System.out.println("Linked List is Empty...");
            return;
        }
        start = start.next;
    }

    void deleteAtMid(int pos) {
        if(start == null) {
            System.out.println("List is Empty...");
            return;
        }
        NodeA<T> temp = null;
        if(pos == 0) {
            temp = start.next;
            start = temp;
            return;
        }
        int i = 1;
        temp = start;
        while(i < pos) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    void midPoint() {
        NodeA<T> slow;
        NodeA<T> fast;
        slow = fast = start;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Mid Point is : " + slow.data);
    }

    void findKthNode(int k) {
        int n = getCount();
        int x = n - k + 1;
        NodeA<T> temp = start;
        for(int i = 1; i < x; i++) {
            temp = temp.next;
        }
        System.out.println("Kth Node : " + temp.data);
    }

    void findKthNodeApproach_2(int k) {
        NodeA<T> p;
        NodeA<T> q;
        p = q = start;
        // move p pointer to the kth position from left
        for(int i = 1; i <= k; i++) {
            p = p.next;
        }
        // now move both p and q pointer
        // when p will reach to the end of list, q will at the kth node from end
        while(p != null) {
            p = p.next;
            q = q.next;
        }
        System.out.println("Kth Node : " + q.data);
    }

    void reverseLinkedList() {
        if(start == null) {
            System.out.println("Linked List is Empty...");
            return;
        }
        if(start.next == null) {
            System.out.println("List contains only one node...");
            return;
        }
        NodeA<T> current = start;
        NodeA<T> prev = null;
        while(current != null) {
            NodeA<T> next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        start = prev;
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
        obj.insertAtEnd(new NodeA<>(100));
        obj.insertAtMid(new NodeA<>(15), 2);
        obj.print();
        obj.reverseLinkedList();
        System.out.println("After Reverse...");
        obj.print();
    }
}
