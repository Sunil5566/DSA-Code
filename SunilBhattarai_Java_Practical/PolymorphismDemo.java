class CompileTime {
    void display() {
        System.out.println("No arguments");
    }

    void display(String msg) {
        System.out.println("Message: " + msg);
    }
}

class Runtime {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Runtime {
    void show() {
        System.out.println("Child class method");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        CompileTime c = new CompileTime();
        c.display();
        c.display("Hello");

        Runtime r = new Child(); // Runtime Polymorphism
        r.show();
    }
}
