

public class validateBST {

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

    public static boolean isValidateBST(Node root, Node min, Node max){

        if(root == null){
            return true;
        }
        if (min != null && root.val <= min.val){
            return false;
        }else if(max!= null && root.val>= max.val){
            return false;
        }
        return isValidateBST(root.left, min, root) &&  isValidateBST(root.right, root, max);

        
    }
    public static void main(String[] args) {
        int arr[] ={1,1,1};
        Node root = null;   

        for (int i = 0; i < arr.length; i++) {
            root = inset(root, arr[i]);
        }

        if(isValidateBST(root, null, null)){
            System.out.println("valid BST");
        }else{
            System.out.println("Invalid BST");
        }
    }
}
