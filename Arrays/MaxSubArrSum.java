import java.util.*;
public class MaxSubArrSum {
        //brute force approach
        public static void BruteForce(int num[]){
            int currSum=0;
            int MaxSum=Integer.MIN_VALUE;

          for(int i=0;i<num.length;i++){
            int start=i; 
            for(int j=i;j<num.length;j++){
              int end=j;
              currSum=0;
              for(int k=start;k<=end;k++){
              currSum =currSum+num[k];
              }
              System.out.println(currSum);
              if(MaxSum<currSum){
                MaxSum=currSum;
              }
            }
          }
          System.out.println("maximum sum is:" + MaxSum);
        }


        //prefix sum approach

        public static void prefixSum(int num[]){
            int currSum=0;
            int MaxSum=Integer.MIN_VALUE;
            int prefix[]=new int[num.length];
            prefix[0]=num[0];

            //calculate prefix array
            for(int i=1;i<prefix.length;i++){
                prefix[i]=prefix[i-1]+num[i];
            }

          for(int i=0;i<num.length;i++){
            int start=i; 
            for(int j=i;j<num.length;j++){
              int end=j;
              currSum= start ==0 ? prefix[end] : prefix[end]-prefix[start-1];
              if(MaxSum<currSum){
                MaxSum=currSum;
              }
            }
          }
          System.out.println("maximum sum is:" + MaxSum);
        }


        //kadanes algorithm
        public static void kadanes(int num[]){
            int ms=Integer.MIN_VALUE;
            int cs=0;

            for(int i=0;i<num.length;i++){
                  cs =cs+num[i];
                if(cs<0){
                    cs=0;
                }
                ms=Math.max(cs,ms);
            }
            System.out.println("our max sum is:"+ms);
          }
            public static void kadaness(int num[]) {
              int ms = num[0]; // instead of Integer.MIN_VALUE
              int cs = num[0]; // instead of 0
          
              for (int i = 1; i < num.length; i++) {
                  cs = Math.max(num[i], cs + num[i]);
                  ms = Math.max(ms, cs);
              }
          
              System.out.println("our max sum is: " + ms);
          }
          //leetcode sol
          public static int kadanesss(int num[]) {
            int ms = Integer.MIN_VALUE;
            int cs = 0;
            int maxElem = num[0];
        
            for (int i = 0; i < num.length; i++) {
                cs += num[i];
                if (cs < 0) cs = 0;
        
                ms = Math.max(ms, cs);
                maxElem = Math.max(maxElem, num[i]);
            }
        
            return (ms == 0) ? maxElem : ms;
        }
        
        public static void main(String[] args) {
            //int num[]={1,-2,6,-1,3};
            //BruteForce(num);
            //prefixSum(num);

            int num[]={-2,-3,4,-1,-2,1,5,-3};
            System.out.println(kadanesss(num));
        }
    }

