public class reverseLL {

    private int size;

    Node head;

    reverseLL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    // add last

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void insert(int data, int idx) {
        Node currentNode = head;
        Node newNode = new Node(data);

        for (int i = 1; i < idx; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public void reverseIterate() {
        Node prevNode = head;
        Node curNode = head.next;
        while (curNode != null) {
            Node nextNode = curNode.next;
            curNode.next = prevNode;
            // update
            prevNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newhead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newhead;
    }

    // print
    public void Print() {

        Node currNode = head;

        System.out.println("");

        if (head == null) {
            System.out.print("empty linked list");
        }

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public int getsize() {
        return size;
    }

    public static void main(String[] args) {

        reverseLL list = new reverseLL();

        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.insert(3, 2);
        list.Print();

        list.head=list.reverseRecursive(list.head);
        list.Print();

    }

}
