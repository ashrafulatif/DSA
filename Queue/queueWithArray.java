public class queueWithArray {


    static class Queue{
        static int arr[];
        static int size ;
        static int rear;

        //initialize with constructor
        Queue(int n){
            arr = new int[n];
            size = n;
            rear=-1;
        }

        //isEmpty 
        public static boolean isEmpty(){
            return rear ==-1;
        }
        //Add
        public static void add (int data){
            //check full or not
            if (rear==size){
                System.out.println("Queue is full");
                return;
            }
            rear= rear+1;
            arr[rear] = data;
           
        }

        //remove
        public static int remove (){
            //check empty
            if (isEmpty()){
                return -1;
            }
            int front = arr[0];

            for (int i =0; i< rear; i++){
                arr[i] = arr[i+1];
            }
             rear =rear-1;
            return front;
        }
        //peek
        public static int peek(){

            if (isEmpty()){
                return -1;
            }

            int front = arr[0];
            return front;
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
