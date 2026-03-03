
import java.util.LinkedList;

public class graphList {

    private int vertices;
    private LinkedList<Integer>[] adlist;

    public graphList(int vertices) {
        this.vertices = vertices;
        adlist = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adlist[i] = new LinkedList<>();
        }
    }

    //add edge
    public void addEdge(int source, int destination) {
        adlist[source].add(destination);
        adlist[destination].add(source);
    }

    //print graph
    public void print() {
        System.out.println("Adjacency List:");

        for (int i = 0; i < vertices; i++) {
            System.out.print(i + "->");
            for (int node : adlist[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        graphList list = new graphList(5);

        //add Edeges
        list.addEdge(0, 1);
        list.addEdge(0, 2);
        list.addEdge(1, 3);
        list.addEdge(0, 2);
        list.addEdge(2, 3);

        list.print();
    }
}
