import java.util.*;
class connnectRopes {
    
    public static void solver( int arr[], int n ){
        
        Queue<Integer> q = new LinkedList<>();
        
        Arrays.sort(arr);
        
        int firstVal = arr[0]+arr[1];
        
        q.add(firstVal);
        int temp =0;
        int total =0;
        
        for (int i=2; i<n; i++){
            temp = q.remove();
            q.add(temp+arr[i]);
            q.add(temp);
        }
    
        while (!q.isEmpty()){
            total = total + q.remove();
        }
        
        System.out.println(total);
    }
    
    public static void main(String[] args) {
        
        int n = 3;
        int arr[] ={1,2,3};
        solver(arr, n);
        
    }
}