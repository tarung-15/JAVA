// package Stacks;
import java.util.*;
public class pushbottom {
    public static void pushAtBottem(Stack<Integer> s,int data){
        if(s.isEmpty()){
           s.push(data);
           return;
        }
        int top=s.pop();
        pushAtBottem(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushAtBottem(s, 5);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
