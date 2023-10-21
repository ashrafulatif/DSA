public class palindromLL {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

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

    public Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newhead;
    }

    public Node findMid(Node head) {

        Node hare = head;
        Node turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean isPalindrom(Node head) {
        // cheacking corner case if the linkedlist is empty
        if (head == null || head.next == null) {
            return true;
        }
        Node middNode = findMid(head);
        Node secHalfStart = reverse(middNode.next);

        Node fhalfStart = head;

        while (secHalfStart != null) {
            if (fhalfStart.data != secHalfStart.data) {
                return false;
            }
            fhalfStart = fhalfStart.next;
            secHalfStart = secHalfStart.next;
        }
        return true;
    }

    public static void main(String[] args) {

        palindromLL ll = new palindromLL();

        ll.addLast(1);
        ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        System.out.println(ll.isPalindrom(ll.head));

    }
}
