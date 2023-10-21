public class DLL_Operation {

    Node head;

    class Node {

        int data;
        Node next;
        Node prev;

        Node(int data) {

            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node curNode = head;

        while (curNode.next != null) {
            curNode = curNode.next;
        }
        Node newNode = new Node(data);
        curNode.next = newNode;
        newNode.prev = curNode;
    }

    public void deleteLast() {
        Node curNode = head;

        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode = curNode.prev;
        curNode.next = null;
    }

    public void delete(int idx) {
        Node curNode = head;

       for (int i= 1; i<idx-1;i++)
       {
        curNode=curNode.next;
       }
       curNode.next=curNode.next.next;
       curNode.prev=curNode;
    }

    public void insert(int data, int idx) {
        Node curNode = head;
        for (int i = 1; i < idx; i++) {
            curNode = curNode.next;
        }

        Node newNode = new Node(data);
        curNode.next.prev = newNode;
        newNode.prev = curNode;
        newNode.next = curNode.next;
        curNode.next = newNode;

    }

    public void Print() {
        Node curNode = head;

        while (curNode != null) {
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        DLL_Operation ll = new DLL_Operation();

        ll.addFirst(5);
        ll.addFirst(10);
        ll.addLast(15);
        ll.addLast(25);
        ll.Print();
        ll.insert(20, 3);
        ll.Print();
        ll.deleteLast();
        ll.Print();
        ll.delete(2);
        ll.Print();
        
    }

}
