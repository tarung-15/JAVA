import java.util.*;

public class CalSum{
    public static int CalculateSum(int c,int d){ //parameters or formal parameters(func def)
      int sum=c+d; 
      return sum;
    }
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int sum =CalculateSum(a, b); //arguments or actual parameters(func call)
       System.out.println(sum);
    }
}