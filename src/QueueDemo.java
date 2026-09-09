// Import Queue interface
import java.util.Queue;
// Import LinkedList class
import java.util.LinkedList;


public class QueueDemo {
    public static void main(String[] args){

         // Create a Queue using LinkedList
    Queue<Integer> queue1  = new LinkedList<>(); 
    
    //adding elements
    queue1.add(10);
    queue1.add(20);
    queue1.add(30);
    queue1.add(40);
    queue1.add(50);
    
    System.out.println("Initial Queue elements: " + queue1);
    
    //remove value
    queue1.remove();
    
    //peek
    System.out.println("View top element: " + queue1.peek());
    
    
    
    }
}
