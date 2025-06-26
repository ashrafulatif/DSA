public class transformToSumTree {
    
    public static class Node{
        int data;
        Node left , right;
        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static int transformSumTree(Node root){
        
        if (root == null){
            return 0;
        }
        //cal left right sub tree
        int leftsub = transformSumTree(root.left);
        int rightsub = transformSumTree(root.right);
        
        int originalval = root.data;
        
        root.data = leftsub + rightsub;
        
        return root.data + originalval;
    }
    public static void print (Node root){
        
        if (root == null) return;
        
        System.out.print(root.data+ " ");
        print(root.left);
        print(root.right);
    }
    
    public static void main(String[] args) {
       
       Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        transformSumTree(root);
        print(root);
   }
}
