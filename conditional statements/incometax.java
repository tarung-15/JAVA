import java.util.*;
public class incometax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tax;
        if(n < 500000){
           tax =0; 
        }else if(n>=500000 && n<1000000){
           tax =(int)(n*0.2);
        }else{
           tax=(int)(n*0.3); 
        }
        System.out.println("tax to be paid is: "+tax);
    }
    
}
