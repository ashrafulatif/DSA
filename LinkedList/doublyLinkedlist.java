
class doublyLinkedlist {

    Node head;

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void display(Node head) {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " ->");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public static void display2(Node randomNode) {
        Node currNode = randomNode;

        while (currNode.prev!= null) {
            currNode = currNode.prev;
        }
        while (currNode != null) {
            System.out.print(currNode.data + " ->");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public static void displayPrev(Node tail) {
        Node currNode = tail;

        while (currNode != null) {
            System.out.print(currNode.data + " ->");
            currNode = currNode.prev;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {

        // 10 20 30 40 60 null
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.prev = null;
        a.next = b;
        a.prev = null;
        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.next = e;
        d.prev = c;
        e.next = f;
        e.prev = d;
        f.next = null;
        f.prev = e;

        // display(a);
        // displayPrev(f);
        display2(e);

    }

}