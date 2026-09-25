package OOPS.Basics.Inheritence;

public class oops11 {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Student extends Person {
        int rollNo;
        String course;

        Student(String name, int age, int rollNo, String course) {
            super(name, age);
            this.rollNo = rollNo;
            this.course = course;
        }

        void display() {
            System.out.println("Name: " + super.name);
            System.out.println("Age: " + super.age);
            System.out.println("Roll No: " + rollNo);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {
        Student s = new Student(
                "Dipan",
                20,
                101,
                "Data Science");

        s.display();
    }
}
