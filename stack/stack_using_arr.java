package stack;

import java.util.*;

public class stack_using_arr {
    public static void main(String[] args) {
        Stack <Integer> s =  new Stack<>();
        s.push(5);
        s.push(10);
        s.push(15);
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
    }

    class func{
        int size = 100000;
        int arr[] = new int[size];
        int top = -1;

        void push(int a){
            top++;
            arr[top] = a;
        }

        int pop(){
            if(top == -1){
                return -1;
            }
            int a = arr[top];
            top--;
            return a;
        }

        int peek(){
            if(top == -1){
                return -1;
            }
            return arr[top];
        }

        int size(){
            return top+1;
        }
    }
}
