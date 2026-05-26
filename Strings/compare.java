public class compare {
    public static void main(String[] args) {
        String s1="Tony";
        String s2="Tony";
        String s3= new String("Tony");

        // if(s1 == s2){
        //     System.out.println("strings are equal");
        // }else{
        //     System.out.println("strings are not equal");
        // }
        //  //because here s1 and s2 are being pointed to the same values which is first stored
        //  //in  s1-Tony and s2 is also pointing s1's tony 
        // if(s1 == s3){
        //     System.out.println("strings are equal");
        // }else{
        //     System.out.println("strings are not equal");
        // }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
        //.equals func checks only the value 
    }
    
}
