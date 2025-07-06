
public class maxDepthofBinTree {

    static class TreeNode{

        int val;
        TreeNode left, right;

        TreeNode(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }
    
    public static int maxDepth(TreeNode root) {
        
        //base case
        if(root == null) return 0;

        int leftSub = maxDepth(root.left);
        int rightSub = maxDepth(root.right);

        return Math.max(leftSub, rightSub)+1;
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxDepth(root));

    }
}
