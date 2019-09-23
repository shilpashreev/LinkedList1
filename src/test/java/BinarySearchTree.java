import java.util.LinkedList;
import java.util.Queue;

class CountNodes
{
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.left.left = new Node(5);
        root.left.right = new Node(11);
        root.right = new Node(22);
        root.right.left = new Node(21);
        root.right.right = new Node(25);

        System.out.println(CountNodes(root));
    }

    public static int CountNodes(Node root) {
        int count = 0;

        if (root == null) return 0;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);


        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if (node.left != null) count++;

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }

        }
        return count;
    }


}

class Node{

    int data;
    Node left, right;

    Node(int data){
        this.data= data;
    }
}




