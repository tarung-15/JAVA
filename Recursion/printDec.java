//package Recursion;
public class printDec {
    public static void Dec(int n){
        if(n == 1){  //base case
            System.out.print(n+" ");
            return;
        }
        //Dec(n-1);
        System.out.print(n +" ");
        Dec(n-1);
    }

    public static void main(String[] args) {
        int n=10;
        Dec(n);
    }
}
