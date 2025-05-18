
public class circularQueueWithArray {
    
    static class Queue {
        
        static int arr[];
        static int front;
        static int rear;
        static int size;

        Queue(int n){

            arr = new int[n];
            front = -1;
            rear = -1;
            size = n;
        }

        //isEmpty
        public static boolean isEmpty(){
            return front ==-1 && rear ==-1;
        }
        //isFull
        public static boolean isFull(){
            return (rear +1)%size == front;
        }

        //add
        public static void add (int data){
            //check
            if (isFull()){
                System.out.println("queue is full");
                return;
            }

            if (front ==-1){
                front =0;
            }

            rear = (rear+1)%size;
            arr[rear] = data;
        }
        //remove
        public static int remove(){
            if (isEmpty()){
                return -1;
            }

             int result = arr[front];

            if (front == rear){ //for del last element
                front = rear = -1;
            }else{
                front = (front +1)%size;
            }

             return result;
        }
        //peek
        public static int peek(){

            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }
    }


    public static void main(String[] args) {
        
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove(); 
        }
    }
}
