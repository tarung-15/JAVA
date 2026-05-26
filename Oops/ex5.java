public class ex5 {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum((float)1.5,(float)2.0));
        System.out.println(cal.sum(1,2,3));
        Deer d=new Deer();
        d.eat();

    }
}
//method overloading
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
//method overriding
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}