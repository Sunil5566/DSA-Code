public class CircularQueue {
    static int[] queue = new int[5];
    static int front = -1, rear = -1, size = 5;

    static void enqueue(int item) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        queue[rear] = item;
    }

    static void dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Dequeued: " + queue[front]);
        if (front == rear) front = rear = -1;
        else front = (front + 1) % size;
    }

    static void printQueue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements:");
        int i = front;
        while (true) {
            System.out.println(queue[i]);
            if (i == rear) break;
            i = (i + 1) % size;
        }
    }

    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        printQueue();
        dequeue();
        printQueue();
    }
}
