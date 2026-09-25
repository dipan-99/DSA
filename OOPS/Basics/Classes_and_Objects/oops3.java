package OOPS.Basics.Classes_and_Objects;

public class oops3 {
    static class Student {
        String name;
        int age;
        int marks;

        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Marks: " + marks);
            System.out.println("Passed: " + isPassed());
        }

        boolean isPassed() {
            if (marks >= 40) return true;

            return false;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Dipan";
        s1.age = 20;
        s1.marks = 85;

        s2.name = "Rahul";
        s2.age = 21;
        s2.marks = 32;

        s1.displayDetails();
        s2.displayDetails();
    }
}
