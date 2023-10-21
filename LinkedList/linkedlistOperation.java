public class linkedlistOperation {

    private int size;

    Node head;

    linkedlistOperation() {
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

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {

        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
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

        linkedlistOperation list = new linkedlistOperation();

        list.addFirst(2);
        list.Print();
        list.addFirst(1);
        list.Print();

        list.addLast(3);
        list.Print();

        // list.deleteFirst();
        // list.Print();
        // list.deleteLast();
        // list.Print();
        // System.out.println(list.getsize());

        list.insert(200, 2);
        list.Print();

        System.out.println(list.head.data);
    }

}
