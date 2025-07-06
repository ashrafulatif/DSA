public class univaluedBinaryTree {
    
    public static class TreeNode{
        int val;
        TreeNode left , right;
        TreeNode(int val){
            this.val= val;
            this.left = null;
            this.right = null;
        }
    }
 
 public static boolean isUnivalidTree(TreeNode root){
     
     //base case
     if (root == null){
         return true;
     }
     
     if( root.left != null && root.val != root.left.val)
     {
         return false;
     }
     if( root.right != null && root.val != root.right.val)
     {
         return false;
     }
     
     boolean leftSub = isUnivalidTree(root.left);
     
     boolean rightSub = isUnivalidTree(root.right);
     
     if (leftSub == false || rightSub == false){
         return false;
     }
     
     return true;

 }
    
    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        System.out.println(isUnivalidTree(root));
    }
}
