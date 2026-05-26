import java.util.*;
public class exp1 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right =null;
        }
    }
    static class BinaryTree{
        static int idx=-1;

        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }


        public static void preorder(Node root){
            if(root ==null){
              //System.out.print(" -1 ");
              return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root ==null){
              //System.out.print(" -1 ");
              return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

           public static void postorder(Node root){
            if(root ==null){
              //System.out.print(" -1 ");
              return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        //levelorder traversal
        public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode =q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
        public static ArrayList<ArrayList<Integer>> levelorder2(Node root){
            ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            ArrayList<Integer> mid=new ArrayList<>();
            while(!q.isEmpty()){
                Node curr=q.remove();
                if(curr==null){
                    ans.add(mid);
                    mid=new ArrayList<>();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    mid.add(curr.data);
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root =tree.buildtree(nodes);
        //System.out.println(root.data);
        //tree.preorder(root);
        //tree.inorder(root);
        //tree.postorder(root);
        //tree.levelOrder(root);
        ArrayList<ArrayList<Integer>> res=tree.levelorder2(root);
        System.out.println(res);
    }
}
