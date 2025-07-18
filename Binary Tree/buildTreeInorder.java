
public class buildTreeInorder {
    
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
    
    static class BinaryTree{
        
        static int idx =-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] ==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
        
        public static void inorder(Node root){
            //base case 
            if(root == null){
                return;
            }
            //left
            inorder(root.left);
            //root
            System.out.print(root.data+" ");
            //right
            inorder(root.right);
        }
    }
    
    
    public static void main(String[] args) {
        
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        
        Node root = tree.buildTree(nodes);
        tree.inorder(root);
    }
}