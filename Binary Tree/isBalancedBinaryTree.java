public class isBalancedBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.left = null;
            this.right = null;
            this.val = val;
        }
    }

    private static int dfsHeigth(TreeNode root) {
        if (root == null)
            return 0;

        int lh = dfsHeigth(root.left);
        if (lh == -1)
            return -1;

        int rh = dfsHeigth(root.right);
        if (rh == -1)
            return -1;

        // |lh-rh|>1 return -1
        if (Math.abs(lh - rh) > 1)
            return -1;

        return Math.max(lh, rh) + 1;
    }

    public static boolean isBalanced(TreeNode root) {
        return dfsHeigth(root) != -1;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(isBalanced(root));
    }
}
