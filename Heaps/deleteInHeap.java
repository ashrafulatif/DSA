import java.util.ArrayList;

public class deleteInHeap {
    
    static class Heap{
        ArrayList <Integer> arr = new ArrayList<>();

       public void add(int data){
         //arr list add
         arr.add(data);
         int x = arr.size()-1;
         int par = (x-1)/2;

        //fix the tree
        while (arr.get(x) < arr.get(par)) {
            //swap
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);


            x = par;
            par = (x-1)/2; 
        }
       }

       public int peek(){
            return arr.get(0);
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }

        private void heapify(int i){

            int left = 2*i + 1;
            int right = 2*i +2;
            int minIdx = i;

            //min index update
            if (arr.size()>left && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
            if(arr.size()>right && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            //swap if minIdx and root is not same
            if(minIdx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }

        }

        public int remove (){
            
            int data = arr.get(0);
            //swap first and last indx
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //delete the last
            arr.remove(arr.size()-1);
            //heapify

            heapify(0);

            return data;
        }
    }

    public static void main(String[] args) {
        
         Heap heap = new Heap();
        heap.add(2);
        heap.add(3);
        heap.add(1);
        heap.add(5);
        heap.add(10);
        heap.add(4);
        System.out.println(heap.arr);

        while (!heap.isEmpty()) {
            System.out.println(heap.peek());

            heap.remove();
        }
    }
}
