
public class SizeOfLargestBSTinBT {

    public static class Node {
        int val;
        Node left, right;
        Node (int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static class Info {
        boolean isBST;
        int size, min, max;
        
        public Info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST= 0;

    public static Info largeBST(Node root){
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        //call for left and right
        Info leftInfo = largeBST(root.left);
        Info rightInfo = largeBST(root.right);

        //calc the size
        int size = leftInfo.size + rightInfo.size +1;
        //find the min and max
        int min = Math.min(root.val, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.val, Math.max(leftInfo.max, rightInfo.max));

        //find isvalidBST 
        if (root.val<= leftInfo.max || root.val>=rightInfo.min){
            return new Info(false, size, min, max);
        }

        //if valid both left and right return true update maxBST
        if (leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }
    
    public static void main(String[] args) {
        
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info info = largeBST(root);

        System.out.println(maxBST);


    }
}
