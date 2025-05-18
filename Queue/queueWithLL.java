
public class queueWithLL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{

        static Node head = null;
        static Node tail = null;


        //isempty
        public static boolean isEmpty(){
            return head ==null && tail == null;
        }
        //add
        public static void add (int data){
            Node newNode = new Node(data);

            if (head == null){
                head = tail = newNode;
                return;
            }

            tail.next  = newNode;
            tail = newNode;
        }
        //remove 
        public static int remove (){
            if (isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            //remove
            int front = head.data;
            //for single element
            if (head == tail){
                head = tail = null;
            }
            else{
                head = head.next;
            }
    
            return front;
        }
        //peek

        public static int peek(){
            if (isEmpty()){
                return-1;
            }
            return head.data;
        }

    }
    

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove(); 
        }
    }
}
