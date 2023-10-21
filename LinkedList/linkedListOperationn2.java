public class linkedListOperationn2 {

    private Node head;
    private Node tail;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        if (tail == null) {
            tail = head;
        }

        newNode.next = head;
        head = newNode;

    }

    public void insertTail(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            insertFirst(data);
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void insert(int data, int index) {
        Node currentNode = head;

        for (int i = 1; i < index; i++) {
            currentNode = currentNode.next;
        }
        Node newNode = new Node(data);
        Node temp = currentNode.next;

        currentNode.next = newNode;
        newNode.next = temp;
    }

    public void Display() {
        Node currentNode = head;

        if (head == null) {
            System.out.println("Empty");
        }
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {

        linkedListOperationn2 list = new linkedListOperationn2();

        list.insertFirst(3);
        list.insertFirst(2);
        list.Display();
        list.insertFirst(1);
        list.Display();
        list.insertTail(4);
        list.insertTail(5);
        list.Display();
        list.insert(100, 3);
        list.Display();
    }
}
