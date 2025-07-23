import java.util.ArrayList;

public class mergeBST {
     public static class Node {
        int val;
        Node left, right;
        Node (int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static void inorder(Node root, ArrayList<Integer> arr){
        if (root==null) return; 

        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
    public static void preorder(Node root){
        if (root==null) return; 

        System.out.print(root.val+" ");
        preorder(root.left );
        preorder(root.right);
    }

    public static Node createBST(ArrayList<Integer> arr, int s, int e){

        if (s>e){
            return null;
        }
        int mid = (s+e)/2;
        Node root = new Node(arr.get(mid));

        root.left = createBST(arr, s, mid-1);
        root.right = createBST(arr, mid+1, e);

        return root;
    }

    public static Node buildMergeBST(Node root1, Node root2){

        //get inorder of arr1 and arr2
        ArrayList<Integer> arr1 = new ArrayList<>();
        inorder(root1, arr1);
        
        ArrayList<Integer> arr2 = new ArrayList<>();
        inorder(root2, arr2);

        //make the final arr
        int i =0,j=0;
        ArrayList<Integer> finalArr = new ArrayList<>();

        while (i < arr1.size() && j< arr2.size()) {
            if (arr1.get(i)<=arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }

        //for left over arr
        while (i<arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;
        }
        while (j<arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }

        return createBST(finalArr, 0, finalArr.size()-1);
    }
 
    public static void main(String[] args) {
        
        Node root1= new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

       Node root =  buildMergeBST(root1, root2);

       preorder(root);
    }
}
