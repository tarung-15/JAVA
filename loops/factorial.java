import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        int fact=1;
        System.out.print("enter the  number: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial of " + n +" is "+ fact);
}
}
