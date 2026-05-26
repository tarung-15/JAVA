import java.util.*;
public class hw1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int counter=0;
        // while(counter<10){
        //     System.out.println("hi");
        //     counter++;
        // }
       do{
        System.out.println("enter your number:");
        int n=sc.nextInt();
        if(n%10==0){
            //break;
            continue;
        }
        System.out.println(n);
       }while(true);

    }
}
