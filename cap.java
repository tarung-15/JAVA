import java.util.*;
public class cap {
    public static String ex1(String str,int n){
        StringBuilder sb =new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            char chh=str.charAt(i);
            if(chh =='#'){
                sb.append(chh);
            }else{
                sb2.append(chh);
            }
        }
        sb.append(sb2);
        return sb.toString();
    }
    public static String ex2(String str){
        StringBuilder sb =new StringBuilder();
        int i=0;
        while(i<str.length()){
            char ch=str.charAt(i);
            int count=0;
            while(i<str.length() && str.charAt(i)==ch && count<9){
                count++;
                i++;
            }
            if(count==1){
                sb.append(ch);
            }else{
                sb.append(ch).append(count);
            }
        }
        return sb.toString();
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<>();
        int strow=0;
        int stcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(strow<=endrow && stcol<=endcol){
            for(int i=stcol;i<=endcol;i++){
                ans.add(matrix[strow][i]);
            }
            for(int j=strow+1;j<=endrow;j++){
                ans.add(matrix[j][endcol]);
            }
            for(int i=endcol-1;i>=stcol;i--){
                if(strow==endrow){
                    break;
                }
                ans.add(matrix[endrow][i]);
            }
            for(int j=endrow-1;j>=strow+1;j--){
                if(stcol==endcol){
                    break;
                }
                ans.add(matrix[j][stcol]);
            }
            strow++;
            stcol++;
            endrow--;
            endcol--;
        }
        return ans;
    }
    public static HashMap<Integer,Integer> occurence(int[] arr){
        Arrays.sort(arr);
        int count=1;
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                hm.put(arr[i-1],count);
                count=1;
            }
        }
        hm.put(arr[arr.length-1],count);
        return hm;
    }
    public static boolean prime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }   
    public static int checkPrime(int n,int n2){
        int res=0;
        // if(!prime(n)){
        //     return -1;
        // }
        // if (n2 == 0) {
        //     return -1;
        // }
        res=n/n2;
        if (prime(res)) {
            return res;
        }
        return -1;
    }
    public static int ex3(String str1,String str2){
        // String str=str1+str2;
        int len=0;
        if(str1.contains(str2)){
            len=str1.length();
        }
        int pow=0;
        int ans=0;
        while(len>0){
            int rem=len%2;
            ans=ans+(int)(rem*Math.pow(10,pow));
            pow++;
            len=len/2;
        }
        return ans;
    }
    public static int ex5(String str){
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        HashMap<Character,Integer> hm=new HashMap<>();
        int count=1;
        for(int i=1;i<ch.length;i++){
            if(ch[i]==ch[i-1]){
                count++;
            }else{
                hm.put(ch[i-1],Math.max(count,2));
                count=1;
            }
        }
        hm.put(ch[ch.length-1],Math.max(count,2));
        int sum=0;
        for(int c: hm.values()){
            sum=sum+c;
        }
        return sum;
    }
    public static void main(String[] args) {
        // String str="Move#Hash#to#Front";
        // int n=str.length();
        // System.out.println(ex1(str, n));

        // String str= "abbccccc";
        // System.out.println(ex2(str));

        // int[] arr={1,2,3,3,4,1,4,5,1,2};
        // System.out.println(occurence(arr));

        // int n=17;
        // int n2=2;
        // System.out.println(prime(n));
        // System.out.println(checkPrime(n, n2));

        // String str1="abfcd";
        // String str2="dbacf";
        // System.out.println(ex3(str1, str2));

        String str="apple";
        System.out.println(ex5(str));
    }
}
