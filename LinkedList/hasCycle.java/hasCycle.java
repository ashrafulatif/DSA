import javax.sound.midi.Soundbank;

public class hasCycle {

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

    public boolean findCycle(Node head) {
        Node fast = head;
        Node slow = head;

        if (head == null) {
            return false;
        }

        while (fast != null && fast.next != null) {
            fast = fast.next.next;//+2
            slow = slow.next; //+1

            if (fast == slow) { //cycle
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        hasCycle ll = new hasCycle();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        // creating loop
        ll.head.next.next.next.next = ll.head;

        System.out.println(ll.findCycle(ll.head));

    }

}
