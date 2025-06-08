public class calculateTreeHeigth {
    
    static class Node {

        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //print the tree
    public static void printTreePreorder (Node root){

        //base case
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        //left 
        printTreePreorder(root.left);
        //right
        printTreePreorder(root.right);
    }

    public static int height(Node root){
        //base case 
        if (root == null) return 0;

        //left h
        int lh = height(root.left);
        //right h
        int rh = height(root.right);

        return Math.max(lh, rh)+1;

    }
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        printTreePreorder(root);
        System.out.println();

        System.out.println("Height of the tree: " +height(root));

    }
}
