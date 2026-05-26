import java.util.*;

public class mock{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=right;
        }
    }
    //public static class BT{
        //static int idx=-1;
        // public static Node buildtree(int nodes[]){
        //     idx++;
        //     if(nodes[idx]==-1){
        //         return null; 
        //     }
        //     Node newnode=new Node(nodes[idx]);
        //     newnode.left=buildtree(nodes);
        //     newnode.right=buildtree(nodes);
        //     return newnode;
        // }
        public static void preorder(Node root){
            if(root==null){
                //System.out.print("-1");
                return;
            }
            System.out.print(root.data);
            preorder(root.left);
            preorder(root.right);
        }
        public static void levelorder(Node root){
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node curr=q.remove();
                if(curr==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.println(curr.data);
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int left=height(root.left);
            int right=height(root.right);
            return Math.max(left,right)+1;
        }
        public static int count(Node root){
            if(root==null){
                return 0;
            }
            int left=count(root.left);
            int right=count(root.right);
            return (left+right)+root.data;
        }
        public static int diameter(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            int rd=diameter(root.right);
            int ld=diameter(root.left);
            int selfDiam=lh+rh+1;
            return Math.max(selfDiam,Math.max(rd,ld));
        }
        public static boolean isIdentical(Node root,Node subroot){
            if(root==null && subroot==null){
                return true;
            }
            else if(root==null || subroot==null || root.data!=subroot.data){
                return false;
            }
            if(!isIdentical(root.left, subroot.left)){
                return false;
            }
            if(!isIdentical(root.right, subroot.right)){
                return false;
            }
            return true;
        }
        public static boolean subtree(Node root,Node subroot){
            if(root==null){
                return false;
            }
            if(root.data==subroot.data){
                if(isIdentical(root,subroot)){
                    return true;
                }
            }
            return subtree(root.left, subroot) || subtree(root.right, subroot);
        }
    //}
    public static void main(String[] args) {
        //int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BT tree=new BT();
        // Node root=tree.buildtree(nodes);
        // System.out.println(root.data);
        // tree.preorder(root);
        // System.out.println();
        // tree.levelorder(root);
        // System.out.println(tree.height(root));
        // System.out.println(tree.count(root));
        // System.out.println(tree.diameter(root));

        Node root =new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.left = new Node(7);

        //subtree
        Node subroot =new Node(2);
        subroot.left=new Node(4);
        subroot.right = new Node(5);
        System.out.println(subtree(root,subroot));
    }
}