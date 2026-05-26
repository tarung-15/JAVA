public class ex4 {
    public static void main(String[] args) {
        // Fish shark=new Fish();
        // shark.eat();
        
        Dog dg=new Dog();
        dg.eat();
        dg.legs=4;
        System.out.println(dg.legs);
    }
}
//inheritance
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("walking");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swiming");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flying");
    }
}
class Dog extends Mammal{
    String breeds;
}

//derived class
// class Fish extends Animal{
//     int fins;
//     void swims(){
//         System.out.println("swims in water");
//     }
// }




// // EXAMPLE
// class Animal {
//     void eat() {
//         System.out.println("Animal eats");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog barks");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();  // inherited
//         d.bark(); // child method
//     }
// }



// class Animal {
//     void eat() { System.out.println("Animal eats"); }
// }

// class Mammal extends Animal {
//     void walk() { System.out.println("Mammal walks"); }
// }

// class Dog extends Mammal {
//     void bark() { System.out.println("Dog barks"); }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();  // grandparent method
//         d.walk(); // parent method
//         d.bark(); // child method
//     }
// }



// class Animal {
//     void eat() { System.out.println("Animal eats"); }
// }

// class Dog extends Animal {
//     void bark() { System.out.println("Dog barks"); }
// }

// class Cat extends Animal {
//     void meow() { System.out.println("Cat meows"); }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat(); d.bark();

//         Cat c = new Cat();
//         c.eat(); c.meow();
//     }
// }



// interface Father {
//     void skillsFather();
// }

// interface Mother {
//     void skillsMother();
// }

// class Child implements Father, Mother {
//     public void skillsFather() { System.out.println("Father skills"); }
//     public void skillsMother() { System.out.println("Mother skills"); }
// }

// public class Main {
//     public static void main(String[] args) {
//         Child c = new Child();
//         c.skillsFather();
//         c.skillsMother();
//     }
// }
// // Base class
// class Animal {
//     void eat() {
//         System.out.println("All animals eat");
//     }
// }

// // Hierarchical level
// class Fish extends Animal {
//     void swim() {
//         System.out.println("Fish swims");
//     }
// }

// class Bird extends Animal {
//     void fly() {
//         System.out.println("Bird flies");
//     }
// }

// class Mammal extends Animal {
//     void walk() {
//         System.out.println("Mammal walks");
//     }
// }

// // Interface for hybrid part
// interface Pet {
//     void play();
// }

// // Multi-level + Hybrid level
// class Shark extends Fish {
//     void attack() {
//         System.out.println("Shark attacks");
//     }
// }

// class Peacock extends Bird {
//     void dance() {
//         System.out.println("Peacock dances");
//     }
// }

// class Dog extends Mammal implements Pet {
//     public void play() {
//         System.out.println("Dog plays with owner");
//     }
// }

// class Cat extends Mammal implements Pet {
//     public void play() {
//         System.out.println("Cat plays with yarn");
//     }
// }

// // Main
// public class Main {
//     public static void main(String[] args) {
//         Shark sh = new Shark();
//         sh.eat();   // from Animal
//         sh.swim();  // from Fish
//         sh.attack();// from Shark
        
//         Peacock p = new Peacock();
//         p.eat();
//         p.fly();
//         p.dance();
        
//         Dog d = new Dog();
//         d.eat();
//         d.walk();
//         d.play();   // from interface
        
//         Cat c = new Cat();
//         c.eat();
//         c.walk();
//         c.play();
//     }
// }
