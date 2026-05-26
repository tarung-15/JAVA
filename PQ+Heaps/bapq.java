import java.util.*;
import java.util.PriorityQueue;
public class bapq{
    static class Student implements Comparable<Student>{ //overriding //understand the meaning of this line
      String name;
      int rank;
      public Student(String name, int rank){
        this.name=name;
        this.rank=rank;
      }
      @Override
      public int compareTo(Student s2){//s2 is another object
        return this.rank-s2.rank;
      }
    }//this is how we compare the classes ke objects ko (IMP)
public static void main(String[] args) {
    //PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
    // pq.add(3);
    // pq.add(2);
    // pq.add(1);
    // pq.add(10);
    
    PriorityQueue<Student> pq=new PriorityQueue<>(Comparator.reverseOrder());
    pq.add(new Student("A",4));
    pq.add(new Student("B",5));
    pq.add(new Student("C",2));
    pq.add(new Student("D",12));

    while(!pq.isEmpty()){
        System.out.println(pq.peek().name+"->"+pq.peek().rank);
        pq.remove();
    }
}
}