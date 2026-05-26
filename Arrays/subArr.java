public class subArr {
    public static void printSubarray(int num[]){
      int TS=0;//total subarray
      int sum=0;
      for(int i=0;i<num.length;i++){
        int start=i; 
        for(int j=i;j<num.length;j++){
          int end=j;
          int subarrysum=0;//sum of current subarray
          for(int k=start;k<=end;k++){
          System.out.print(num[k]+" ");
          subarrysum =subarrysum+num[k];
          }
          TS++;
          sum=sum+subarrysum;//add to total sum
          System.out.println("sum is " + subarrysum);
        }
        System.out.println();
      }
      System.out.println("total subarrys are:" + TS);
      System.out.println("sum of subarrays is "+sum);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        printSubarray(num);
    }
}
