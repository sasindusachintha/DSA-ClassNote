import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        
        //adding elements
        list.add("Car");
        list.add("Van");
        list.add("Bike");
        list.add("lorry");
        list.add("Plane");
        
        System.out.println(list);
        
        // add one at first
          list.addFirst("Ship");
           System.out.println(list);
           
          list.addLast("Boat");
           System.out.println(list);
          
        //remove
          list.remove("Bike");
           System.out.println(list);
        
        list.addLast("Yatch");
        System.out.println(list);
    }
}
