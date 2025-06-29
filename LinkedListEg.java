class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        head = head.next;
    }

    public void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        if (head.next == null) { // If only one node is present
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void insertAtNth(int data, int position) {
        Node newNode = new Node(data);

        if (position < 0) {
            System.out.println("Invalid position.");
            return;
        }

        // Insert at the beginning
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        // If position is out of bounds
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtNth(int position) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (position < 0) {
            System.out.println("Invalid position.");
            return;
        }

        // Delete at beginning (position 0)
        if (position == 0) {
            deleteAtFirst();
            return;
        }

        // Traverse to the node before the one to delete
        Node temp = head;
        for (int i = 0; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        // Check if position is out of bounds
        if (temp.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        // Delete the node by skipping it
        temp.next = temp.next.next;
    }

    // Print list
    public void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("No elements in linked list");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class LinkedListEg {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();

        linkedlist.print(); // Empty list
        linkedlist.deleteAtFirst(); // Nothing to delete
        linkedlist.insertAtLast(3);
        linkedlist.insertAtLast(5);
        linkedlist.insertAtLast(7);
        linkedlist.insertAtLast(9);
        System.out.println("\nAfter Inserting Elements At Last :");
        linkedlist.print(); // 3 --> 5 --> 7 --> 9 --> NULL

        linkedlist.insertAtFirst(1);
        System.out.println("\nAfter Inserting Element At First :");
        linkedlist.print(); // 1 --> 3 --> 5 --> 7 --> 9 --> NULL

        linkedlist.insertAtNth(4, 4);
        System.out.println("\nAfter Inserting Element At 5th Position :");
        linkedlist.print(); // 1 --> 3 --> 5 --> 7 --> 4 --> 9 --> NULL

        linkedlist.deleteAtFirst();
        System.out.println("\nAfter Deleting Element At First :");
        linkedlist.print(); // 3 --> 5 --> 7 --> 4 --> 9 --> NULL

        linkedlist.deleteAtLast();
        System.out.println("\nAfter Deleting Element At Last");
        linkedlist.print(); // 3 --> 5 --> 7 --> 4 --> NULL

        linkedlist.deleteAtNth(2);
        System.out.println("\nAfter Deleting Element At 3rd Position :");
        linkedlist.print(); // 3 --> 5 --> 4 --> NULL

        System.out.println();
        linkedlist.deleteAtNth(10); // Should print "Position out of bounds."
    }
}

