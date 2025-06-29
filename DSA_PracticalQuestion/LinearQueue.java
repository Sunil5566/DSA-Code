public class LinearQueue {
    static int[] queue = new int[5];
    static int front = -1, rear = -1;

    static void enqueue(int item) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) front = 0;
        rear++;
        queue[rear] = item;
    }

    static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Dequeued: " + queue[front]);
        front++;
    }

    static void printQueue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements:");
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        printQueue();
        dequeue();
        printQueue();
    }
}
