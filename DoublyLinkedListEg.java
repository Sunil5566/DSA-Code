class DoublyLinkedList {
    private static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    // Insert at the end
    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Insert at the beginning
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Delete from the beginning
    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        if (head == tail) { // Only one element
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    // Delete from the end
    public void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        if (head == tail) { // Only one element
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    // Insert at a specific position (0-based index)
    public void insertAtNth(int data, int position) {
        Node newNode = new Node(data);

        if (position < 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (head == null) {
            if (position == 0) {
                head = tail = newNode;
            } else {
                System.out.println("Position out of bounds. List is empty.");
            }
            return;
        }

        if (position == 0) {  // Insert at beginning
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {  // Insert at the end
            insertAtLast(data);
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Delete at a specific position (0-based index)
    public void deleteAtNth(int position) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (position < 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 0) {  // Delete at beginning
            deleteAtFirst();
            return;
        }

        Node temp = head;
        for (int i = 0; i < position && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {  // Position out of bounds
            System.out.println("Position out of bounds.");
            return;
        }

        if (temp == tail) {  // Delete last node
            deleteAtLast();
            return;
        }

        // Delete in the middle
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    // Print the list from head to tail
    public void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("No elements in linked list");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class DoublyLinkedListEg {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.print(); // Empty list
        dll.deleteAtFirst(); // Nothing to delete

        dll.insertAtLast(4);
        dll.insertAtLast(2);
        dll.insertAtLast(10);
        dll.insertAtLast(33);
        System.out.println("\nAfter Inserting Elements At Last:");
        dll.print(); // 4 <-> 2 <-> 10 <-> 33 <-> NULL

        dll.insertAtFirst(12);
        System.out.println("\nAfter Inserting Element At First:");
        dll.print(); // 12 <-> 4 <-> 2 <-> 10 <-> 33 <-> NULL

        dll.insertAtNth(5, 4);
        System.out.println("\nAfter Inserting Element At 5th Position:");
        dll.print(); // 12 <-> 4 <-> 2 <-> 10 <-> 5 <-> 33 <-> NULL

        dll.deleteAtNth(4);
        System.out.println("\nAfter Deleting Element At 5th Position:");
        dll.print(); // 12 <-> 4 <-> 2 <-> 10 <-> 33 <-> NULL

        dll.deleteAtFirst();
        System.out.println("\nAfter Deleting Element At First:");
        dll.print(); // 4 <-> 2 <-> 10 <-> 33 <-> NULL

        dll.deleteAtLast();
        System.out.println("\nAfter Deleting Element At Last:");
        dll.print(); // 4 <-> 2 <-> 10 <-> NULL

        System.out.println();
        dll.deleteAtNth(10); // Should print "Position out of bounds."
    }
}
