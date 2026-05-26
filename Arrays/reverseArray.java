public class reverseArray {
    public static void reverse(int num[]){
       int first=0;int last=num.length-1;
       while(first<last){
        int temp=num[last];
        num[last]=num[first];
        num[first]=temp;

        first++;
        last--;
       }

    // for (int first = 0, last = num.length - 1; first < last; first++, last--) {
    //     int temp = num[last];
    //     num[last] = num[first];
    //     num[first] = temp;
    // }

    //    for(int i=0;i<num.length;i++){
    //     System.out.print(num[i]+" ");
    // }
    // System.out.println();

    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}

