public class constru3 {
    public static void main(String[] args) {
        Student s1= new Student();
        // Student s2= new Student("tarun");
        // Student s3= new Student(123);
        s1.name="tarun";
        s1.roll=456;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2=new Student(s1);
        s2.password="xyz";
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    
    // shallow copy constructor
    // Student(Student s1){
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }

    //deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
    
    Student(){
        marks=new int[3];
        System.out.println("constructor is called..");
    }
    Student(String name){
        marks=new int[3];
        this.name=name;
    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;
    }
}



//DEFAULT NON PARA
// class Student {
//     String name;
//     int roll;
//     // Default constructor
//     Student() {
//         name = "Unknown";
//         roll = 0;
//         System.out.println("Default constructor called");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student();  // Default constructor invoked
//         System.out.println(s1.name + ", " + s1.roll); // Unknown, 0
//     }
// }

//PARA
// class Student {
//     String name;
//     int roll;
//     // Parameterized constructor
//     Student(String name, int roll) {
//         this.name = name;
//         this.roll = roll;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student("Tarun", 101);
//         System.out.println(s1.name + ", " + s1.roll); // Tarun, 101
//     }
// }

//SHALLOW COPY
// class Student {
//     String name;
//     int[] marks;
//     // Shallow copy constructor
//     Student(Student s) {
//         this.name = s.name;
//         this.marks = s.marks; // references same array
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "Tarun";
//         s1.marks = new int[]{100, 90, 80};
//         Student s2 = new Student(s1);  // Shallow copy
//         s2.marks[0] = 50;
//         System.out.println(s1.marks[0]); // 50 → changed because array is shared
//     }
// }

//DEEP COPY
// class Student {
//     String name;
//     int[] marks;
//     // Deep copy constructor
//     Student(Student s) {
//         this.name = s.name;
//         this.marks = new int[s.marks.length];
//         for (int i = 0; i < s.marks.length; i++) {
//             this.marks[i] = s.marks[i];
//         }
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "Tarun";
//         s1.marks = new int[]{100, 90, 80};
//         Student s2 = new Student(s1);  // Deep copy
//         s2.marks[0] = 50;
//         System.out.println(s1.marks[0]); // 100 → original array remains unchanged
//     }
// }
