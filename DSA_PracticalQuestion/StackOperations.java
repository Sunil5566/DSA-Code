public class StackOperations {
    static int[] stack = new int[5];
    static int top = -1;
    static int size = stack.length;

    static void push(int number) {
        if (top >= size - 1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top] = number;
    }

    static int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        int value = stack[top];
        top--;
        return value;
    }

    static void printStack() {
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        push(4);
        push(95);
        push(87);
        printStack();
        int poppedValue = pop();
        System.out.println("Popped value: " + poppedValue);
        printStack();
    }
}
