// import java.util.Stack;

// public class ex2{
//     public static boolean isDuplicate(String str){
//         Stack<Character> s=new Stack<>();
//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             if(ch==')'){
//                 int count=0;
//                 while (s.peek()!='(') {
//                     s.pop();
//                     count++;
//                 }
//                 if(count<1){
//                     return true;
//                 }else{
//                     s.pop();
//                 }    
//             }else{
//                 s.push(ch);
//             }
//         }
//                     return false;
//     }
//     public static void main(String[] args) {
//         String str="(a+b)";
//         System.out.println(isDuplicate(str));

//     }
// }

import java.util.HashSet;

import DivideConquer.quicksort;
import Queues.stackTwoQue;

public class ex2{
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int swap=1;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=1;
                }
            }
            if(swap==0){
                break;
            }
        }
    }
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertion(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 &&curr<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void count(int arr[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            large=Math.max(large, arr[i]);
        }
        int[] c=new int[large+1];
        for(int i=0;i<arr.length;i++){
            c[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<c.length;i++){
            while(c[i]>0){
                arr[j]=i;
                j++;
                c[i]--;
            }
        }
    }
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=ei) {
            temp[k++]=arr[j++];
        }
        for(k=0,i=si; k<temp.length; k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pii=partion(arr,si,ei);
        quicksort(arr,si,pii-1);
        quicksort(arr,pii+1,ei);
    }
    public static int partion(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
            int temp=pivot;
            arr[ei]=arr[i];
            arr[i]=temp;
        return i;
    }
    public static void dupli(int arr[]){
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        System.out.println(s.size());
    }
    public static void main(String[] args) {
        int[] arr={5,4,1,3,5,5,2,6,1};
        dupli(arr);
        //int arr[]={1,4,1,3,2,4,3,7};
        //count(arr);
        //bubble(arr);
        //selection(arr);
        //insertion(arr);
        //mergesort(arr, 0, arr.length-1);
        // quicksort(arr, 0, arr.length-1);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }
    }
}