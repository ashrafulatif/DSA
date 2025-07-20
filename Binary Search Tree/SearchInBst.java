
public class SearchInBst {
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

    public static void inorder (Node root){
        if (root == null) return ;

        inorder(root.left);
        System.out.print(root.val+ " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.val == key){
            return true;
        }
        if(root.val> key){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        
        int arr[] ={5,1,3,4,2,7,8,10,9,6};
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = inset(root, arr[i]);
        }

        inorder(root);

        if(search(root, 10)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }    
}
