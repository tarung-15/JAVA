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
