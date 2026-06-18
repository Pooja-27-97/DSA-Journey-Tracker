public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //methods
    public void addFirst(int data) {
        //new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        //new node next -> head
        newNode.next = head;
        //head = new node
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail= newNode;
    }

    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        //prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        // if(head == null) {
        //     System.out.println("Empty");
        //     return;
        // }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        System.out.println(size);
        ll.add(2, 7);
        ll.print();
        System.err.println(size);
    }
}
