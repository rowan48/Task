public class Problemo9 {
    static class Node
    {
        int key;
        Node left, right;
    }
    static Node newNode(int key)
    {
        Node node = new Node();
        node.key = key;
        node.left = node.right = null;
        return (node);
    }
    static int sum(Node root)
    {
        if (root == null)
            return 0;
        return (root.key + sum(root.left) +
                sum(root.right));
    }

    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.right.left = newNode(6);
        root.right.right = newNode(7);
        root.right.left.right = newNode(8);

        int sum = sum(root);
        System.out.println("Sum of all the elements is: " + sum);
    }
}
