public class deleteInBST {

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

    public static Node deleteNode(Node root, int val){

        //find the val
        if (root.val>val){
            root.left = deleteNode(root.left, val);
        }
        else if (root.val<val){
            root.right = deleteNode(root.right, val);
        }else{
            //case 1
            if (root.left == null && root.right == null){
                return null;
            }
            //case 2
            if (root.left == null){
                return root.right;
            }else if (root.right == null){
                return root.left;
            }

            //case 3 
            //first find the inorder successor
            Node Is = findInorderSucceesor(root.right);
            root.val = Is.val;
            root.right = deleteNode(root.right, Is.val);
        }
        return root;
    }

    public static Node findInorderSucceesor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root; 
    }

    public static void main(String[] args) {
        int arr[] ={8,5,3,1,4,6,10,11,14};
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

        System.out.println();

        root = deleteNode(root, 10);
        inorder(root);

        
    }
}