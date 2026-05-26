import java.util.*;
public class IpOpUpdate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[50];
        System.out.println("length of array="+marks.length);

         marks[0]=sc.nextInt();
         marks[1]=sc.nextInt();
         marks[2]=sc.nextInt();
        System.out.println("phys marks is " +marks[0]);
        System.out.println("chem marks is " +marks[1]);
        System.out.println("math marks is " +marks[2]);
         
        marks[2]=marks[2]+2;

        System.out.println("updated math marks are:" +marks[2]);
 
        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println(percentage + "%");
    }
}