
public class pathSum {

    public static class TreeNode {

        int val;
        TreeNode left, right;
        TreeNode(int val){
            this.val = val;
            this.left = right = null;
        }
    }

 
    public static boolean hasPathSum(TreeNode root, int targetSum) {

        //base case 
        if (root == null) return false;

        targetSum -= root.val;

        if(root.left == null && root.right== null && targetSum == 0){
            return true;
        }

        boolean leftSub = hasPathSum(root.left, targetSum);
        boolean rightSub = hasPathSum(root.right, targetSum);

        return leftSub || rightSub;

    }
    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        int target = 4;

        System.out.println(hasPathSum(root, target));

    
    }
}
