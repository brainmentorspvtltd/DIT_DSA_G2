package LinkedList;

class ListNode {
    int data;
    ListNode next;
    ListNode(int data) {
        this.data = data;
    }
}

public class SplitLinkedList {
    ListNode start;
    ListNode tail;

    void splitCircular() {
        ListNode fast = start;
        ListNode slow = start;
        while(fast.next != start && fast.next.next != start) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast.next.next == start) {
            fast = fast.next;
        }
        ListNode start_1 = start;
        ListNode start_2 = null;
        if(start.next != start) {
            start_2 = slow.next;
        }
        fast.next = slow.next;
        slow.next = start;
        print(start_1);
        System.out.println("=========");
        print(start_2);
    }

    void print(ListNode start) {
        ListNode temp = start;
        while(temp.next != start) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    
    void add(int data){
        if(start == null) {
            tail = start = new ListNode(data);
            return;
        }
        ListNode node = new ListNode(data);
        tail.next = node;
        tail = node;
    }

    public static void main(String[] args) {
        SplitLinkedList obj = new SplitLinkedList();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        // Circular Linked List
        obj.tail.next = obj.start;
        obj.splitCircular();
    }
}