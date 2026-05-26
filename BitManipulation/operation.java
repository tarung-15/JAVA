public class operation {

    public static int getIthbit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }

    public static int clearIthbit(int n,int i){
        int bitmask=~(1<<i);
        return n & bitmask;
    }

    public static int updateIthbit(int n,int i,int newBit){
    //    if(newBit ==0){
    //     return clearIthbit(n,i);
    //    }else{
    //     return setIthbit(n,i);
    //    }
    //or
    n=clearIthbit(n,i);
    int bitmask=newBit<<i;
    return n|bitmask;
    }

    public static int clearIbits(int n,int i){
        int bitmask =(~0)<<i; 
        return n & bitmask;
    }
    public static int clearRangeibits(int n,int i,int j){
       int a=((~0)<<(j+1));
       int b=(1<<i)-1;
       int bitmask =a|b;
       return n & bitmask; 
    }
    public static boolean ispowerOfTwo(int n){
        return (n&(n-1))==0;
    }

    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){ //check our LSB
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fastExp0(int a,int n){
        int ans =1;
        while(n>0){
            if((n&1)!=0){ //check LSB
                ans =ans *a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getIthbit(7, 2));
         System.out.println(setIthbit(10, 2));
       //System.out.println(clearIthbit(10, 1));
       //System.out.println(updateIthbit(10, 2, 1));
       //System.out.println(clearIbits(15, 2));  
       //System.out.println(clearRangeibits(10, 2, 4)); 
     //  System.out.println(ispowerOfTwo(8));   
    //System.out.println(countSetBits(10));
    System.out.println(fastExp0(3,5 ));
    }
}
