public class deleteNafterM {

    Node head;
    class Node  {

        int data; 
        Node next;

        Node(int data)
        {
            this.data=data;
            next= null;
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

    public void SkipMdeleteN(int m,int n)
    {
        Node curNode=head;
       Node t;

        while(curNode!=null)
        {
            for(int i= 1; i<m&&curNode!=null;i++ )
            {
                curNode= curNode.next;
            }
            if(curNode==null)
            {
                return;
            }
            t= curNode.next;

            for(int i=1; i<=n&&t!=null; i++)
            {
                t= t.next;
            }
             // Link the previous list with remaining nodes 
            curNode.next=t;
            // Set current pointer for next iteration 
            curNode=t;
        }
    }
    public void swapNode(int x,int y)
    {
     Node curNode=head;
       Node t=head;

        // while(curNode!=null)
        // {
            for(int i= 1; i<x&&curNode!=null;i++ )
            {
                curNode= curNode.next;
            }
           
            //temp=curNode.data;
            //System.out.println(temp);

            for(int i=1; i<y&&t!=null; i++)
            {
                t= t.next;
            }
            //System.out.println(t.data);
            int temp1=t.data;
            t.data=curNode.data;
            curNode.data=temp1;
        // }
    }
      
    


public static void main(String[] args) {

    deleteNafterM ll=new deleteNafterM();

    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    // ll.addLast(5);
    // ll.addLast(6);
    // ll.addLast(7);
    // ll.addLast(8);

    ll.Print();
    // ll.SkipMdeleteN(2, 2);
    ll.swapNode(2, 4);

    ll.Print();
    
}
}
