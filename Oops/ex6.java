public class ex6 {
    public static void main(String[] args) {
        Horse h= new Horse();
        h.eat();
        h.walk();

        chicken c =new chicken();
        c.eat();
        c.walk();

        //Animal a =new Animal(); ->we cannot create this

        System.out.println(h.color);

        Mustang myHorse =new Mustang(); //Animal-> horse -> mustang
        }
}
abstract class Animal{
    String color;

    Animal(){
        color="brown";
        System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("eating");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("horse construtor called");
    }
    void changecolor(){
        color="white";
    }
    void walk(){
        System.out.println("walking on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor called");
    }
}
class chicken extends Animal{
    void changecolor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walking on 2 legs");
    }
}
