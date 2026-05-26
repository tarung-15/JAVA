public class Pairs {
    public static void Pair(int num[]){
      int Tp=0;//total pair
      for(int i=0;i<num.length;i++){
        int curr=num[i]; //2,4,6,8,10
        for(int j=i+1;j<num.length;j++){
            System.out.print("("+ curr + ","+num[j]+")");
            Tp++;
        }
        System.out.println();
      }
      System.out.println("total pais are:" + Tp);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        Pair(num);
    }
}
