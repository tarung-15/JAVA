import java.util.*;
public class accen {
     public static int ex1(int[] arr){
        int count=0;
        int maxx=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>maxx){
                maxx=arr[i];
                count++;
            }
        }
        return count;
    }
    public static int ex2(int n){
        // int peice=1;
        // int prev=0;
        // while(n>=0){
        //     peice=peice+prev;
        //     prev++;
        //     n--;
        // }
        // return peice;
        int ans=(((n*(n+1))/2)+1)%1000000007;
        return ans;
    }
    public static int ex3(int n){
        int ans=0;
        if(n<9){
            return n;
        }
        if(n%2==0){
            ans=(n-2)/2;
        }else if(n%2!=0){
            ans=n/2;
        }
        return ans;
    }
    public static int ex4(int m,int n){
        int num=0;
        int nn=0;
        for(int i=1;i<=m;i++){
            if(i%n==0){
                num=num+i;
            }else{
                nn=nn+i;
            }
        }
        return Math.abs(nn-num);
    }
    public static int ex5(int[] arr){
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                l1.add(arr[i]);
            }else{
                l2.add(arr[i]);
            }
            Collections.sort(l1);
            Collections.sort(l2);
        }
        return (l1.get(l1.size()-2))+(l2.get(1));
    }
    public static int ex6(int arr[],int n,int sum){
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]+arr[i-1]<sum){
                return arr[i]*arr[i-1];
            }
        }
        return -1;
    }
    public static String ex7(int n,int num){
        StringBuilder sb=new StringBuilder();
        int rem=0;
        while(num>0){
            rem=num%n;
            num=num/n;
            if(rem>9){
                char ch=(char)(rem+55);
                sb.append(ch);
            }else{
                sb.append(rem);
            }
        }
        return sb.reverse().toString();
    }
    public static int ex8(int num1,int num2){
        int rem1=0;
        int rem2=0;
        int count=0;
        int carry=0;
        while(num1>0 || num2>0){
            rem1=num1%10;
            rem2=num2%10;
            if(rem1+rem2+carry >9){
                carry=1;
                count++;
            }else{
                carry=0;
            }
            num1=num1/10;
            num2=num2/10;
        }
        return count;
    }
    public static String ex9(String str){
        int cu=0;
        int cl=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!Character.isUpperCase(ch)){
                cl++;
            }else{
                cu++;
            }
        }
        if(cu>cl){
            return str.toUpperCase();
        }else{
            return str.toLowerCase();
        }
    }
    public static String ex10(String str){
        if(str=="rock"){
            return "paper";
        }else if(str=="scissor"){
            return "rock";
        }else if(str=="paper"){
            return "scissor";
        }else{
            return "invalid string";
        }
    }
    // public static int[] ex11(int[] arr){
    //    Arrays.sort(arr);
    //    ArrayList<Integer> l1=new ArrayList<>();
    //    for(int i=1;i<arr.length;i=i+2){
    //     if(arr[i]==arr[i-1]){
    //         continue;
    //     }else{
    //         l1.add(arr[i]);
    //     }
    //    }
    //    int[] ans=new int[l1.size()];
    //    ans=l1.toArray(ans);
    //    return ans;
    // }
    public static int ex12(String str){
        // int[] count=new int[26];
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxodd=Integer.MIN_VALUE;
        int mineven=Integer.MAX_VALUE;
        for(int count: map.values()){
            if(count%2==0){
                mineven=Math.min(count,mineven);
            }
            if(count%2!=0){
                maxodd=Math.max(maxodd, count);
            }
        }
        return Math.abs(maxodd-mineven);
    }
    public static String ex20(String str){
        char[] chh=str.toCharArray();
        HashSet<Character> hs=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        int rem=0;
        for(int i=0;i<chh.length;i++){
            if(hs.contains(chh[i]) && ){
                sb.append("*");
            }else{
            rem=(char)(chh[i]-97+1);
            sb.append(chh[i]);
            sb.append(rem);
            hs.add(chh[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // int[] arr={8,10,6,2,9,7};
		// System.out.println(ex1(arr));
        // int n=5;

        // System.out.println(ex2(n));
        // int n=10;

        // System.out.println(ex3(n));
        // int n=3;
        // int m=10;

        // System.out.println(ex4(m, n));

        // int[] arr={3,2, 1, 7, 5, 4};
        // System.out.println(ex5(arr));

        // int arr[]={9, 8, 3, -7, 3, 9};
        // int n=6;
        // int sum=4;
        // System.out.println(ex6(arr, 6, 4));

        // int n=21;
        // int num=5678;
        // System.out.println(ex7(n,num));
        
            // int num1=23;
            // int num2=563;
            // System.out.println(ex8(23, 563));
        
            // System.out.println(ex9("xYg"));
            // System.out.println(ex10("scissor"));

            // String str="aabbcccddddd";
            // System.out.println(ex12(str));
            String str="azabab";
            System.out.println(ex20(str));

    }
}
