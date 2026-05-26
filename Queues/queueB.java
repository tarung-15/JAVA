//package Queues;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class queueB {
    static class MyQueue{
        static int arr[];
        static int size;
        static int rear;

        MyQueue(int n){ //constructor
            arr =new int[n];
            size =n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        //add
        public static void add(int data){
            if(rear == size-1){
                System.out.println("queue is full");
                return;
            }
            rear =rear+1;
            arr[rear]=data;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front =arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear =rear-1;
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
       MyQueue q =new MyQueue(5);
        // Queue<Integer> q =new LinkedList<>(); // LinkedList orArrayDeque Q)find differences 
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
