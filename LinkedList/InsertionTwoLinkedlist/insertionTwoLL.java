public class insertionTwoLL {

    static class Node
    {
        int data;
        Node next;

        Node (int data)
        {
            this.data= data;
            next= null;
        }
    }

    public Node getInserNode(Node h1, Node h2)   //here outer loop comaparing all the node and return the node
    {                                            // brute force applied here
        while(h2!=null)
        {
            Node temp = h1;
            while(temp!=null)
            {
                if (temp==h2)
                {
                    return h2;
                }
                temp=temp.next;
            }
            h2=h2.next;
        }
        return null;
    }

    public static void main(String[] args) {

        insertionTwoLL ll=new insertionTwoLL();

        Node h1, h2;

        h1 = new Node(10);
        h2 = new Node(3);
 
        Node newNode = new Node(6);
        h2.next = newNode;
 
        newNode = new Node(9);
        h2.next.next = newNode;
 
        newNode = new Node(15);
        h1.next = newNode;
        h2.next.next.next = newNode;
 
        newNode = new Node(30);
        h1.next.next = newNode;
 
        h1.next.next.next = null;
        

        Node point = ll.getInserNode(h1,h2);

        if(point==null)
        {
            System.out.println("Not found");
        }
        else 
        {
            System.out.println("found "+point.data);
        }

        
    }
}
