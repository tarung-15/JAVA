import java.util.*;
public class primeornot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        //  if(n==2){
        //     System.out.println("n is a prime number");
        // }else{
        //     boolean isPrime=true;
        //     for(int i=2;i<=Math.sqrt(n);i++){
        //         if(n%i==0){
        //             isPrime=false;
        //             break;
        //         }
        //     }
        //     if(isPrime==true){
        //         System.out.println("n is prime number "+n);
        //     }else{
        //         System.out.println("n is not prime number "+n);
        //     }
        // }
        
        if(n<2) System.out.println("not prime");
        else if(n==2) System.out.println("prime");
        else if(n%2==0) System.out.println("not prime");
        else {
            boolean isPrime=true;
            for(int i=3;i<Math.sqrt(n);i+=2){
                if(n%2==0){
                    isPrime=false;
                    break;
                }
            }
            System.out.println(isPrime ? "prime" : "not prime");
        }
    }
}


