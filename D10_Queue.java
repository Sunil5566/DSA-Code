class Queue {
    int front;
    int rear;
    int queue[];

    Queue(int queueSize) {
        this.queue = new int[queueSize];
        this.front = 0;
        this.rear = 0;
    }

    public void enQueue(int data) {
        if (rear == queue.length) {
            System.out.println();
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = data;
    }

    public int deQueue() throws Exception {
        if (front >= rear) {
            System.out.println("Queue is Empty");
            throw new Exception("Queue is Empty");
        }
        int data = queue[front++];
        return data;
    }

    void print() {
        for (int i = front; i < queue.length; i++) {
            System.out.println(queue[i] + " ");
        }
    }

}

public class D10_Queue {
    public static void main(String[] args) {

        Queue queue = new Queue(3);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.print();

        queue.deQueue(8);
        queue.print();






    }

}
