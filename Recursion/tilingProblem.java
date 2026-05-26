public class tilingProblem {
    public static int tiling(int n){
        //base case
        if(n ==0 || n==1){
            return 1;
        }
        //work --choice
        //vertical tiling
        int nm1=tiling(n-1);
        //horizontal tiling
        int nm2=tiling(n-2);
        int totalways=nm1+nm2;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
