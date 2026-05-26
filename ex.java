import java.util.HashMap;
import java.util.HashSet;
import java.util.*;
public class ex{
    public static boolean pri(int n){
        if(n<0){
            return false;
        }
        if(n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void isRange(int n){
        for(int i=2;i<=n;i++){
            if(pri(i)){
                System.out.println(i);
            }
        }
    }
    public static void fibo(int n){
        int n1=0;
        int n2=1;
        System.out.print(n1 +" "+ n2+" ");
        for(int i=2;i<n;i++){
            int temp=n1+n2;
            n1=n2;
            n2=temp;
            System.out.print(temp+" ");
        }
    }
    public static int bs(int arr[],int key){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==key){
                return mid;
            }if(arr[mid]<key){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return -1;
    }
    public static void sub(int arr[]){
        int ts=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int cs=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                    cs=cs+arr[k];
                }
                ts++;
                System.out.print(" --->"+cs);
                sum=sum+cs;
                System.out.println();
            }
        }
        System.out.println(ts);
        System.out.println(sum);
    }
    public static int ka(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        int maxele=arr[0];
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms,cs);
            maxele=Math.max(maxele,arr[i]);
        }
        return ms==0?maxele:ms;
    }
    public static int stock(int arr[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>buyprice){
                int profit=arr[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }else{
                buyprice=arr[i];
            }
        }
        return maxprofit;
    }
    public static boolean dupli(int arr[]){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i])){
                return true;
            }else{
                hs.add(arr[i]);
            }
        }
        return false;
    }
    public static int search(int arr[],int key){
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]==key){
                return mid;
            }if(arr[si]<=arr[mid]){
                if(arr[si]<=key && key<arr[mid]){
                    ei=mid-1;
                }else{
                    si=mid+1;
                }
            }else{
                if(arr[mid]<key && arr[ei]>=key){
                    si=mid+1;
                }else{
                    ei=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int key=0;
        System.out.println(search(arr, 0));
    }
}