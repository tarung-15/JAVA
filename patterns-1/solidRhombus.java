public class solidRhombus {
    public static void sol_rhom(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){ //spaces
                System.out.print( " ");
            }
            for(int j=1;j<=n;j++){ //stars
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        sol_rhom(5);
    }
    
}
