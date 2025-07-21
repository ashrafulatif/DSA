import java.util.ArrayList;

public class rootToLeafPath {

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

    public static void findroot2LeafPath(Node root, ArrayList<Integer> path){
        if (root == null){
            return;
        }
        //add the node
        path.add(root.val);

        if(root.left == null && root.right == null){
            System.out.println(path);
        }
        findroot2LeafPath(root.left, path);
        findroot2LeafPath(root.right, path);

        //backtrack and remove node from arraylist
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {

        int arr[] ={8,5,3,6,10,11,14};
        Node root = null;   

        for (int i = 0; i < arr.length; i++) {
            root = inset(root, arr[i]);
        }

        findroot2LeafPath(root, new ArrayList<>());
    }
}
