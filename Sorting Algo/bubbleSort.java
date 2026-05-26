import java.util.Arrays;
import java.util.Collections;
public class bubbleSort {
    
    public static void BubSort(Integer arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void Printarr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void Sortedarr(Integer arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int swapped=0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=1;//it marks the swap occured or swapped++
                }
            }
        if (swapped==0){
            break;
        }
        }
    }//this is only for sorted array time complexity is O(n) 1,2,3,4,5

    public static void main(String[] args) {
        //int arr[]={5,4,1,3,2};
        Integer arr[]={5,4,1,3,2};
        //BubSort(arr);
        //Printarr(arr);
       //Sortedarr(arr);

        //Arrays.sort(arr);
        //Arrays.sort(arr,0,3);
        Arrays.sort(arr,0,5,Collections.reverseOrder());
        Printarr(arr);
    }
}
