package ArrayLists;
import java.util.*;
import java.util.Collections;
public class basic{
    public static void swap(ArrayList<Integer> list ,int idx1,int idx2){
        int temp =list.get(idx1);
        list.set(idx1 , list.get(idx2));
        list.set(idx2,temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        ArrayList<String> list2 =new ArrayList<>();
        list.add(2); //O(1)
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // int idx1=1 ,idx2=3;
        // System.out.println(list);
        // swap(list ,idx1 ,idx2);
        // System.out.println(list);

         System.out.println(list);
         Collections.sort(list);//ascending
         System.out.println(list);
         //descending
        Collections.sort(list ,Collections.reverseOrder());
        System.out.println(list); 


        // list.add(1, 9); //O(n)
        //System.out.println(list.size());

        //print the arraylist
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        //get operation O(1)
        // int ele=list.get(2);
        // System.out.println(ele);
       
        //remove element
        // list.remove(3);
        // System.out.println(list);

        //set-adds/replace ele at that index
        // list.set(2,10);
        // System.out.println(list);

        //contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
 
        //reverse of arraylist-O(n)
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i)+ " ");
        // }
        // System.out.println();

        //maximum
        // int max =Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     // if(max < list.get(i)){
        //     //     max = list.get(i);
        //     // }
        //     max =Math.max(max,list.get(i));
        // }
        // System.out.println("max ele " + max);
    }
}