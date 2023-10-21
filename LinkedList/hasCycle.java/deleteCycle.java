public class deleteCycle {

    static Node head;

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void removeCycle() {
        Node fast = head;
        Node slow = head;

        if (head == null) {
            return;
        }

        while (fast != null && fast.next != null) {
            fast = fast.next.next;// +2
            slow = slow.next; // +1
            boolean cycle = false;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        // find the meeting point
        slow = head;
        Node prev = null; // last node
        while (fast != slow) { // cycle

            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null; // remove the cycle by pointing last node null
        System.out.println("the loop deleted");
    }

    public static boolean findCycle() {
        Node fast = head;
        Node slow = head;

        if (head == null) {
            return false;
        }

        while (fast != null && fast.next != null) {
            fast = fast.next.next;// +2
            slow = slow.next; // +1

            if (fast == slow) { // cycle
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // deleteCycle ll = new deleteCycle();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(4);

        // // creating loop
        // ll.head.next.next.next.next = ll.head;

        // System.out.println(ll.findCycle(ll.head));

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Node temp = head.next;
        head.next.next.next.next = temp;

        System.out.println(findCycle());

        removeCycle();
        System.out.println(findCycle());

    }

}
