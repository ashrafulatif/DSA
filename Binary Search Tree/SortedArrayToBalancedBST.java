
public class SortedArrayToBalancedBST {

    public static class Node {
        int val;
        Node left, right;
        Node (int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static Node sortedArrayBalancedBST(int arr[],int s, int e ){

        if (s>e){
            return null;
        }
        int mid = (s+e)/2;

        //create new node
        Node root = new Node(arr[mid]);
        root.left = sortedArrayBalancedBST(arr, s, mid-1);
        root.right = sortedArrayBalancedBST(arr, mid+1, e);

        return root;

    } 
    public static void preorder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        
        int arr[] = {3,5,6,8,10,11,12};

        Node root = sortedArrayBalancedBST(arr, 0, arr.length-1);
        preorder(root);
    }
}
