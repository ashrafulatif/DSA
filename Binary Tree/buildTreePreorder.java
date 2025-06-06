
public class buildTreePreorder {
 
    static class Node{

        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

     static class BinaryTree {
        //for iteration
        static int idx = -1;

        public static Node buildTree (int nodes[]){

            idx++;
            //base case
            if (nodes[idx]==-1){
                return null;
            }

            //create newNode 
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        
        //pre-order
        public static void preOrder(Node root){  //root -> left -> right

            //bse case 
            if (root == null){
                System.out.print(-1+ " ");
                return;
            }
            System.out.print(root.data+ " ");
            //left
            preOrder(root.left);
            //right
            preOrder(root.right);

        }
    }

    
    public static void main(String[] args) {
        
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        
        tree.preOrder(root);


    }
}
