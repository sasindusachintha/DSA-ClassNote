
public class LinkedList {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
        Node head = null;

// create list
        public void createList() {
            head = null;
            System.out.println("Linked List Created !");
        }

// insert at front
        public void insert(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            System.out.println(data + " Inserted at front");
        }

// inset at rear
        public void insertAtRear(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            System.out.println(data + " inserted at rear!");
        }

//        insert at specific location
        public void insert(int data, int location) {
            Node newNode = new Node(data);

            if (location == 1) {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node temp = head;
            for (int i = 1; i < location - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Invalid location.");
                return;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            System.out.println(data + " ");
        }

        public void print(){
            Node temp = head;
            
            while( temp != null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
            }
            System.out.println("null");
        }
    

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.createList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insertAtRear(50);
        
        list.insert(456, 4);
        
        list.print();
        
    }
}
