//package Recursion;

public class ex3 {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int nm1=fact(n-1); //n minus 1
        int f=n*nm1;
        return f;
    }
    public static int sumN(int n){
        if(n==1){
            return 1;
        }
        int nm1=sumN(n-1);
        int Sn=n+nm1;
        return Sn;
    }
    public static int fibo(int n){
        if(n==1 || n==0){
            return n;
        }
        int nm1=fibo(n-1);
        int nm2=fibo(n-2);
        int fn=nm1+nm2;
        return fn;
    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurence(arr, key, i+1);
        if(isFound ==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        // int xnm1=power(x,n-1);
        // int xn=x*xnm1;
        // return xn;
        //or
        return x*power(x, n-1);
    }
    public static int powerOptimized(int x,int n){
       if(n==0){
        return 1;
       }
       int halfpow=powerOptimized(x, n/2);//o(logn)
       //int halfpowsq=powerOptimized(x, n/2)*powerOptimized(x, n/2); //O(n)
       int halfpowsq=halfpow*halfpow;
       //n is odd
       if(n% 2!=0){
        halfpowsq= x* halfpowsq;
       }
       return halfpowsq;
    }
    public static void main(String[] args) {
        // int n=5;
        // System.out.println(fact(n));
        // System.out.println(sumN(5));
        // System.out.println(fibo(10));
        int arr[]={8,3,6,9,5,10,2,5,3};
        //int key=4;
        System.out.println(powerOptimized(2, 10));

    }
}
