class DNode {
    int data;
    DNode prev, next;
    DNode(int d) {
        data = d;
        prev = next = null;
    }
}

public class DoublyLinkedList {
    DNode head = null;

    void insert(int value) {
        DNode newNode = new DNode(value);
        if (head == null) head = newNode;
        else {
            DNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    void printList() {
        DNode temp = head;
        System.out.println("Doubly Linked List:");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(100);
        list.insert(200);
        list.insert(300);
        list.printList();
    }
}
