
package sasi.dsa;
import java.util.Stack;

public class Stacks {
    public static void main (String[] args){
        // create the stack-stack1
        Stack<Integer> stack1 = new Stack<>();
        
        //push elemenets
        stack1.push(3);
        stack1.push(4);
        stack1.push(4);
        stack1.push(2);
        
        System.out.println(stack1);
        
        System.out.println("Peek the Stack:" +  stack1.peek());
        System.out.println("Pop the top element:" +  stack1.pop());
    }
}
