class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class SinglyLinkedList {
    Node head = null;

    void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    void printList() {
        Node temp = head;
        System.out.println("Singly Linked List:");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.printList();
    }
}

