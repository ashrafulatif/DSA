import java.util.ArrayList;

public class lowestCommonAncestor {

    static class Node {
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path){

        //base case
        if(root == null) return false;

        path.add(root);

        if(root.data == n) return true;

        //left
        boolean foundLeft = getPath(root.left, n, path);
        //right
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight ) return true;
        
        path.remove(path.size()-1);

        return false;
    }

    public static Node findLCA(Node root, int n1, int n2){

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        //find path
        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i =0; 
        while (i< path1.size() && i < path2.size()) {
            if(path1.get(i)!=path2.get(i)){
                break;
            }
            i++;
        }

        Node lac = path1.get(i-1);
        return lac;
    }

    //2nd approch
    public static Node findLCA2(Node root, int n1, int n2){

        if(root == null || root.data == n1 || root.data == n2 ) return root;

        //left
        Node leftSub = findLCA2(root.left, n1, n2);
        //right
        Node righSub = findLCA2(root.right, n1, n2);

        //right return val but left return null
        if(leftSub == null) return righSub;

        if(righSub == null) return leftSub;

        return root;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

    
        System.out.println(findLCA2(root, 4, 5).data);
        
    }
    
}
