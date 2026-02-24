<<<<<<< HEAD
=======
//importing packages
>>>>>>> eb5e28094b2c1a10af6c7caa3ebdfe1f9d65e339
import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args){
    Queue<Integer> queue1  = new LinkedList<>();  //create queue
    
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
