package Backtracking;

public class subset {
    public static void Subsett(String str,String ans,int i){
    if(i==str.length()){
        if(ans.length()==0){
            System.out.println("null");
        }else{
            System.out.println(ans);
        }
        return;
    }
    Subsett(str, ans+str.charAt(i), i+1);    //yes choice
    Subsett(str, ans, i+1);// no choice
    }
    public static void main(String[] args) {
        String str ="abc";
        Subsett(str, "", 0);
    }
}
