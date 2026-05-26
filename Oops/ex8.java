public class ex8 {
    public static void main(String[] args) {
    //static keyword
    //    Student s1=new Student();
    //    s1.schoolname="Nandi"; 

    //    Student s2=new Student();
    //    System.out.println(s2.schoolname);
    
    //super
    Horse h =new Horse();
    System.out.println(h.color);

    }
}
//static keyword
// class Student{
//     String name;
//     int roll;
//     static String schoolname;

//     void setName(String name){
//         this.name=name;
//     }
//     String getName(){
//         return this.name;
//     }
// }

//super keyword
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super.color="brown";
        //super();//it prints the immediate parent  class
        System.out.println("horse constructor is called");
    }
}
