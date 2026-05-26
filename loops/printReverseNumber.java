import java.util.*;
public class printReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=15102004;
        while(n>0){
           int lastDigit=n%10;
           System.out.print(lastDigit);
           n=n/10;
        }
        System.out.println();
    }
}
