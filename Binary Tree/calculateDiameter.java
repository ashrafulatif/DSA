public class calculateDiameter {
    
    static class Node{
        int data;
        Node left , right;
        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if (root == null) return 0;

        int lh = height(root.left);
        int th = height(root.right);

        return Math.max(lh, th)+1;
    }

    public static int Diameter(Node root){
        if (root == null) return 0;

        int ld = Diameter(root.left);
        int lh = height(root.left);
        int rd = Diameter(root.right);
        int rh = height(root.right);

        //diameter with root
        int selfDiameter = lh + rh + 1;
        return Math.max(Math.max(ld, rd),selfDiameter);
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        System.out.println(Diameter(root));
    }
}
