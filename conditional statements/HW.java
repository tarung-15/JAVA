import java.util.*;
public class HW {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // int x=sc.nextInt();
        // if(x>0){
        //     System.out.println("the number is positive " +x);
        // }else{
        //     System.out.println("the number is neagtive" + x);
        // }

        // int n= sc.nextInt();
        // switch(n){
        //     case 1:System.out.println("monday");
        //             break;
        //     case 2:System.out.println("tuesday");
        //             break;
        //     case 3:System.out.println("wednesday");
        //     break;
        //     case 4:System.out.println("thrusday");
        //     break;
        //     case 5:System.out.println("friday");
        //     break;
        //     case 6:System.out.println("saturday");
        //     break;
        //     case 7:System.out.println("sunday");
        //     break;
        //    default:System.out.println("dont know");

        // }

        int n=sc.nextInt();
        if (n % 4 == 0 && (n % 100 != 0 || n % 400 == 0)){//A year is a leap year if:
            //It is divisible by 4 AND
            //It is not divisible by 100 unless it is also divisible by 400.
            System.out.println("the given is a leap year");
        }else{
            System.out.println("the given year is not a leap year");
        }

    }
}
