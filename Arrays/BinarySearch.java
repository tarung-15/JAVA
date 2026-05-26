public class BinarySearch {
    public static int Search(int arr[],int key){
        int start=0;
        int end = arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;

           //comaprisions
           if(arr[mid]==key){
            return mid;
           }
           if(arr[mid]<key){//right
           start=mid+1;
            }else{//left
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,9,10,13,6};
        int key=6;
        System.out.println("key is at index:" + Search(arr, key));
    }
}
