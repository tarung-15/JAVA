import java.util.*;
public class HW {

    public static void alloccurence(int[] arr,int key,int i){
        if(i == arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+"");
        }
        alloccurence(arr, key, i+1);

    }
    //print number to letter 
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"}; 
    public static void printDigits(int number){
        if(number == 0){
            return;
        }
        int lastDigit =number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+ " ");
    }


    //length of string
    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return length(str.substring(1)) + 1;
    }
    
     //first letter and last letter matching
    // public class Solution {
    //     public static int countSubstrs(String str, int i, int j, int n) {
    //         if (n == 1) {
    //             return 1;
    //         }
    //         if (n <= 0) {
    //             return 0;
    //         }
    //         int res = countSubstrs(str, i + 1, j, n - 1)
    //                 + countSubstrs(str, i, j - 1, n - 1)
    //                 - countSubstrs(str, i + 1, j - 1, n - 2);
    //         if (str.charAt(i) == str.charAt(j)) {
    //             res++;
    //         }
    //         return res;
    //     }
    //     public static void main(String[] args) {
    //         String str = "abcab";
    //         int n = str.length();
    //         System.out.print(countSubstrs(str, 0, n - 1, n));
    //     }
    // }
    
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key =2;
       alloccurence(arr, key,0);
       //printDigits(1234);
    //    String str = "abcde";
    //    System.out.println(length(str));
    }
}
