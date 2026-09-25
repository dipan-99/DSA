package OOPS;

public class oops4 {
    static class Student {

        String name;
        int age;
        int marks;

        Student(String n, int a, int m) {
            name = n;
            age = a;
            marks = m;
        }

        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Marks: " + marks);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Dipan", 20, 85);
        Student s2 = new Student("Rahul", 21, 32);

        s1.displayDetails();
        System.out.println();

        s2.displayDetails();
    }
}
