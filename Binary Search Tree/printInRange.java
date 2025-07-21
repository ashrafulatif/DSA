
public class printInRange {
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

    public static void printinRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if (root.val>=k1 && root.val <=k2){
            printinRange(root.left, k1, k2);
            System.out.print(root.val+" ");
            printinRange(root.right, k1, k2);
        }else if (root.val < k1){
            printinRange(root.left, k1, k2);
        }else{
            printinRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        int arr[] ={5,1,3,4,2,7,8,10,9,6};
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = inset(root, arr[i]);
        }

        printinRange(root, 5, 10);

    }
}
