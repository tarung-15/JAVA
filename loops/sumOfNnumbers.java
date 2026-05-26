import java.util.*;
public class sumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int sum=0;
        // int i=1;
        // while(i<=n){
        //     sum=sum+i;
        //     i++;
        // }
        // System.out.println(sum);
        
        int sum=0;
        int val=1;
        for(int i=0;i<n;i++){
            sum=sum+val;
            val++;
        }
        System.out.println(sum);
    }
}
