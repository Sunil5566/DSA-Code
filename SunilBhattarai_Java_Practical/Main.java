import java.util.*;

class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name, age and grade of student " + (i + 1) + ": ");
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextDouble());
        }

        Arrays.sort(students, (a, b) -> Double.compare(b.grade, a.grade));

        System.out.println("\nTop student with highest grade:");
        System.out.println("Name: " + students[0].name + ", Age: " + students[0].age + ", Grade: " + students[0].grade);
    }
}
