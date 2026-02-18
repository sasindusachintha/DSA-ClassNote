package sasi.dsa;

import java.util.Stack;

public class Stack2 {

    public static void main(String[] args) {
        //create the stack-stack2
        Stack<Integer> stack2 = new Stack<>();

        //push elements
        stack2.push(2);
        stack2.push(3);
        stack2.push(6);
        stack2.push(7);
        stack2.push(1);

        System.out.println(stack2);

        System.out.println("Pop the top element: " + stack2.pop());
        System.out.println("Pop the top element: " + stack2.pop());

        System.out.println("Peek the top element: " + stack2.peek());

        System.out.println(stack2);

    }
}
