public class linearSearch {

    public static int search(int numbers[],int key){
      for(int i=0;i<numbers.length;i++){
        if(numbers[i]==key){
            return i;
        }
      }
      return -1;
    }

    // public static int search(String menu[],String key){
    //     for(int i=0;i<menu.length;i++){
    //       if(menu[i]==key){
    //           return i;
    //       }
    //     }
    //     return -1;
    //   }
    public static void main(String[] args) {
        int numbers[]={1,3,5,10,4,7};
        int key=10;

        //String menu[]={"samosa","idili","puri","chips","coke"};
        //String key="idili";

        // int index=search(numbers, key);
        // if(index ==-1){
        //     System.out.println("NOT found");
        // }else{
        //     System.out.println("item/number is at index:" + index);
        // }
       System.out.println(search(numbers, key));
    }
}
