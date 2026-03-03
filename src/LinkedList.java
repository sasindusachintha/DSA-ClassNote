
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
    public void insertatlocation(int data, int location) {
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

    public void deleteHead() {
        if (head == null) {
            System.out.println("Empty Linked List!");
            return;
        }
        head = head.next;
        System.out.println("previous head deleted.!");
    }

    public void deleteTail() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        if (head.next == null) {
            System.out.println("Deleted data /no data");
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Tail data deleted!");
    }

    public void deleteAtLocation(int p) {
        if (head == null) {
            System.out.println("Empty!");
            return;
        }
        if (p == 1) {
            System.out.println(head.data + " deleted");
            return;
        }
        Node temp = head;
        for (int i = 1; i < p - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Invalid position/ not found");
            return;
        }
        System.out.println("Data deleted at given location");
        temp.next = temp.next.next;
    }

    public void search(int key){
        Node temp = head;
        int position = 1;
        
        while(temp != null){
            if(temp.data == key){
                System.out.println(key + " found at "+ position);
            return;
            }
            temp = temp.next;
            position++;
        }
        System.out.print(key + " Not found in the linked list");
    }
    
    public void print() {
        Node temp = head;

        while (temp != null) {
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
        list.deleteAtLocation(3);
        list.insertatlocation(456, 4);
        list.deleteTail();
        list.print();

    }
}
