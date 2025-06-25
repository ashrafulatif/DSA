public class minDistancebetweenNodes {
    
     static class Node {
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node findLCA(Node root, int n1, int n2){

        if(root == null || root.data == n1 || root.data == n2 ) return root;

        //left
        Node leftSub = findLCA(root.left, n1, n2);
        //right
        Node righSub = findLCA(root.right, n1, n2);

        //right return val but left return null
        if(leftSub == null) return righSub;

        if(righSub == null) return leftSub;

        return root;
    }

    public static int lcaDist(Node lcaRoot, int n ){

        if(lcaRoot == null) return -1;

        if (lcaRoot.data == n ) return 0;

        int leftDist = lcaDist(lcaRoot.left, n);
        int rightDist = lcaDist(lcaRoot.right, n);

        if (leftDist == -1  && rightDist == -1) return -1;
        else if(leftDist == -1)return rightDist+1;
        else return leftDist+1;
    }

    public static int minDistance(Node root, int n1, int n2){
        Node lca = findLCA(root, n1, n2);

        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1+dist2;
    } 

    public static void main(String[] args) {
        

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

    
        System.out.println(minDistance(root, 4, 6));
    }
}
