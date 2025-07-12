
//level order approach
import java.util.*;
class kthLevelOrderofTree {
    
    public static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    
    public static void kthLevel (Node root, int k){
        
        if (root == null) return;
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        q.add(null);
        
        while (!q.isEmpty()){
            
            Node cur = q.remove();
            
            if(cur == null){
                k--;
                if (q.isEmpty()){
                    break;
                }else{ 
                    q.add(null);
                }
            }else{
                
                if (k==1){
                    System.out.print(cur.val+" ");
                }
                if (cur.left !=null){
                    q.add(cur.left);
                }
                if (cur.right != null){
                    q.add(cur.right);
                }
                
            }
        }
        
    }
    
    public static void main(String[] args) {
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        kthLevel(root, 3);
    }
}


