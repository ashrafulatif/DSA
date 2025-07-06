public class DeleteLeavesWithValues {
    
    static class Node{
        Node left;
        Node right;
        int data;
        
        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node removeLeafNodes(Node root, int target){
        
         //base case
        if (root == null) return null;
        
        //recur left and rigth subtree
        Node leftSub = removeLeafNodes(root.left, target);
        Node rightSub = removeLeafNodes(root.right, target);
        
        root.left = leftSub;
        root.right = rightSub;
        
        //check matches
        if (root.left == null && root.right == null && root.data == target ){
            
            return null;
        }
        
        return root;
    }
    
    //print
    public static void print(Node root){
        if (root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }
    
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        
        removeLeafNodes(root, 3);
        print(root);
        
    }
}
