import java.util.*;
public class largestNum {

   public static int getLargest(int num[]){
    int largest=Integer.MIN_VALUE;
    int smallest=Integer.MAX_VALUE;

    for(int i=0;i<num.length;i++){
        if(smallest>num[i]){
            smallest=num[i];
        }
        if(num[i]>largest){
            largest=num[i];
        }
    }
    System.out.println("smallest value is:"+smallest);;
    return largest;
   }
    public static void main(String[] args) {
        int num[]={2,3,5,6,8,10,9};
         System.out.println(getLargest(num));
    }
}
