public class zigzagLL {

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

    public void zigzag() {
        // find mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        // reverse the 2nd half

        Node cur = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;
        while (cur != null) {

            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        // alternate marging

        Node Rh = prev;
        Node Lh = head;
        Node nextL, nextR;

        while (Lh != null && Rh != null) {
            nextL = Lh.next;
            Lh.next = Rh;
            nextR = Rh.next;
            Rh.next = nextL;

            Rh = nextR;
            Lh = nextL;
        }

    }

    public static void main(String[] args) {

        zigzagLL ll = new zigzagLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.Print();

        ll.zigzag();
        ll.Print();

    }
}
