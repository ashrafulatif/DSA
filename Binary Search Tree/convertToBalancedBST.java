import java.util.ArrayList;

public class convertToBalancedBST {

    public static class Node {
        int val;
        Node left, right;
        Node (int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static void inorder(Node root, ArrayList<Node> ans){
        if (root==null) return; 

        inorder(root.left, ans);
        ans.add(root);
        inorder(root.right, ans);
    }

    //for print the tree in preorder
    public static void preorder(Node root){
        if (root==null) return; 

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node createBalancedBST(ArrayList<Node> ans, int s, int e ){

        if(s>e){
            return null;
        }
        //find the mid
        int mid = (s+e)/2;
        Node root = new Node(ans.get(mid).val);

        root.left = createBalancedBST(ans, s, mid-1);
        root.right = createBalancedBST(ans, mid+1, e);

        return root;
    }


    
    public static void main(String[] args) {
        
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        ArrayList ans = new ArrayList<>();
        inorder(root, ans);

        root = createBalancedBST(ans, 0, ans.size()-1);

        preorder(root);




    }
}
