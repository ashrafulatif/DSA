public class kthLevelOfTree {

    static class Node {
    
        int data;
        Node left, right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void kthLevel(Node root, int lvl, int k){

        //base case
        if (root == null) return;

        if (lvl == k){
            System.out.print(root.data+" ");
            return;
        }

        //left
        kthLevel(root.left, lvl+1, k);
        //right
        kthLevel(root.right, lvl+1, k);
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        kthLevel(root, 1, 3);
    }
}
