public class TreeDemo {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Binary Tree Traversal class
    static class BinaryTreeDemo {

        // Inorder Traversal (Left → Root → Right)
        public void inorder(Node root) {
            if (root != null) {
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }
        }
    }

    public static void main(String[] args) {
        // Create tree nodes
        Node root = new Node(5);
        root.left = new Node(10);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.left.right = new Node(25);

        
        BinaryTreeDemo tree = new BinaryTreeDemo();

       
        System.out.print("Inorder Traversal: ");
        tree.inorder(root);

       
    }
}
