
import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;
    ArrayList<Integer> insertedValues = new ArrayList<>();

    public Node insert(Node root, int value) {
        insertedValues.add(value);

        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public Node find(Node root, int value) {
        if (root == null || root.data == value) {
            return root;
        }

        if (value < root.data) {
            return find(root.left, value);
        } else {
            return find(root.right, value);
        }
    }

    public Node deleteNode(Node root, int value) {
        if (root == null) return null;

        if (value < root.data) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.data) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            Node temp = findMinimum(root.right);
            root.data = temp.data;
            root.right = deleteNode(root.right, temp.data);
        }

        return root;
    }

    public Node findMinimum(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public void printInsertedValues() {
        System.out.println("Values in the order of insertion:");
        for (int val : insertedValues) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        tree.printInsertedValues();

        int searchValue = 60;
        Node result = tree.find(tree.root, searchValue);
        if (result != null) {
            System.out.println("Node " + searchValue + " found in the BST.");
        } else {
            System.out.println("Node " + searchValue + " not found in the BST.");
        }

        int deleteValue = 30;
        tree.root = tree.deleteNode(tree.root, deleteValue);
        System.out.println("After deleting node " + deleteValue + ":");
        tree.printInsertedValues();
    }
}
