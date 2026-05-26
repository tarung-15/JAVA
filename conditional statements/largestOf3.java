public class largestOf3 {
    public static void main(String[] args) {
        int a=3;
        int b=44;
        int c=10;
        if(a>b && a>c){
            System.out.println("a is the largest" +a);
        }else if(b>c){
            System.out.println("b is largest");
        }else{
            System.out.println("c is largest");
        }
    //ternary operator
    int number=5;
    String type=((number%2)==0) ? "even" :"odd";
    System.out.println(type);
    } 
}
