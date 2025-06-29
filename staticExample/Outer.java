package staticExample;

public class Outer {
    static void sayHello(){
        System.out.println("hello");
    }

    static class Inner{
        void displayDetails(){
            System.out.println("Inner class data");
        }
    }
    public static void main(String[] args) {
        Outer.sayHello();   //like thus excess data
        Inner nav = new Inner();
        nav.displayDetails();
        
    }
}


//with out object excess data..............or call