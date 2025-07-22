
public class MirrorBST {

    public static class Node {
        int val;
        Node left, right;
        Node (int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static Node inset (Node root, int val){
        //create node if root is null
        if (root == null){
            root = new Node(val);
            return root;
        }
        if (root.val > val){
            //left subtree
            root.left = inset(root.left, val);
        }else{
            //right subtree
            root.right = inset(root.right, val);
        }

        return root;
    }

    public static Node mirrorBSTFunc(Node root){
        //base case
        if (root == null){
            return null;
        }
        //find mirror for left and right sub tree
        Node leftSub = mirrorBSTFunc(root.left);
        Node rightSub = mirrorBSTFunc(root.right);

        //swap
        root.left = rightSub;
        root.right = leftSub;

        return root;
    }

    public static void main(String[] args) {
        
        int arr[] ={1,1,1};
        Node root = null;   

        for (int i = 0; i < arr.length; i++) {
            root = inset(root, arr[i]);
        }


    }    
}
