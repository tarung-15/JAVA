//package BST;
import java.util.*;

import javax.swing.tree.TreeNode;
public class p1 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
        public static Node insert(Node root,int val){
            if(root==null){
                root=new Node(val);
                return root;
            }
            if(root.data>val){
                root.left=insert(root.left,val);
            }else{
                root.right=insert(root.right,val);
            }
            return root;
        }
        public static boolean search(Node root,int key){
            if(root ==null){
                return false;
            }
            if(root.data==key){
                return true;
            }
            if(root.data>key){
                return search(root.left,key);
            }else{
                return search(root.right,key);
            }
        }
        public static void inorder(Node root){
            if(root==null){
                return; 
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static Node delete(Node root,int val){
            if(root==null){
                return null;
            }
            if(root.data<val){
                root.right=delete(root.right,val);
            }else if(root.data>val){
                root.left=delete(root.left,val);
            }else{//cases
                //case1
                if(root.left==null && root.right==null){
                    return null;
                }
                //case2
                if(root.left==null){
                    return root.right;
                }else if(root.right==null){
                    return root.left;
                }
                //case3
                Node IS=findInOrderSucessor(root.right);
                root.data=IS.data;
                root.right=delete(root.right,IS.data);
            }
            return root;
        }
        public static Node findInOrderSucessor(Node root){
            while(root.left!=null){
                root=root.left;
            }
            return root;
        }

        public static void printpath(ArrayList<Integer> path){
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i)+"->");
            }
            System.out.println("N");
        }
        public static void printroot2leaf(Node root,ArrayList<Integer> path){
            if(root==null){
                return;
            }
            path.add(root.data);
            if(root.left==null && root.right==null){
                printpath(path);
            }
            printroot2leaf(root.left, path);
            printroot2leaf(root.right, path);
            path.remove(path.size()-1);
        }
    // public boolean isValidBST(TreeNode root) {
    //     return solution(root,null,null);
    // } IGNORE
    public static boolean solution(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }else if(max!=null && root.data>=max.data){
            return false;
        }
        return solution(root.left,min,root) && solution(root.right,root,max);
    }
    public static void main(String[] args) {
        //int values[]={5,1,3,4,2,7};
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();

        // if(search(root,5)){
        //     System.out.println("found");
        // }else{
        //     System.out.println("not found");
        // }

        // //delete
        // root=delete(root,5);
        // System.out.println();
        // inorder(root);

        // printroot2leaf(root, new ArrayList<>()); 
        if(solution(root,null,null)){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
    }
}
