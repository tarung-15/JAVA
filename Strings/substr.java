public class substr {
    public static String subString(String str,int si,int ei){
        String substrr="";
        for(int i=si;i<ei;i++){
            substrr =substrr + str.charAt(i);
        }
        return substrr;
    }
    public static void main(String[] args) {
        String str="HELLOWORLD";
        System.out.println( str.substring(0, 5));  
        System.out.println(subString(str, 0, 5));
    }
}
