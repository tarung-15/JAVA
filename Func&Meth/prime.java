public class prime {

    // public static boolean isPrime(int n){
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // OPTIMIZED WAY
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //PRIMES IN RANGE
    public static void primesInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){//true
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
       //System.out.println(isPrime(7)); 
       primesInRange(20);//2 to 20
    }
}
