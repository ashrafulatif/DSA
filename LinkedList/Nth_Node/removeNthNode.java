import java.util.*;

public class removeNthNode {

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

    public Node listNode(Node head, int n) {
        if (head.next == null) {
            return null;
        }
        int size = 0;
        Node curNode = head;
        while (curNode != null) {
            curNode = curNode.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }

        int idxTosearch = size - n;
        Node prev = head;
        for (int i = 1; i < idxTosearch; i++) {

            prev = prev.next;
        }
        // int i = 1;
        // while (i < idxTosearch) {
        // prev = prev.next;
        // i++;
        // }
        prev.next = prev.next.next;

        return head;
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

    public static void main(String[] args) {

        removeNthNode ll = new removeNthNode();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.Print();
        System.out.println(ll.head.data);
        ll.head = ll.listNode(ll.head, 2);
        ll.Print();

    }
}
