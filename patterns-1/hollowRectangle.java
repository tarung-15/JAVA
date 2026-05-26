public class hollowRectangle {

    public static void hollowrectangle(int totRows, int totCols){
      for(int i=1;i<=totRows;i++){ //outer loop
        for(int j=1;j<=totCols;j++){ //inner cols
            if(i==1 || i==totRows || j==1 || j==totCols){ //boundry cells
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
      }
    }
    public static void main(String[] args) {
        hollowrectangle(4, 5);
    }
}
