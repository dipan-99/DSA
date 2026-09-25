package OOPS.Basics.Inheritence;

public class oops10 {
    static class Person {
        String name;
        int age;

        void displayPersonInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    static class Student extends Person {
        int rollNo;
        String course;

        void displayStudentInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Roll No: " + rollNo);
            System.out.println("Course: " + course);
        }
    }

    static class Teacher extends Person {
        String subject;
        double salary;

        void displayTeacherInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Subject: " + subject);
            System.out.println("Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();

        s.name = "Dipan";
        s.age = 20;
        s.rollNo = 101;
        s.course = "Data Science";

        t.name = "Rahul";
        t.age = 35;
        t.subject = "Java";
        t.salary = 80000;

        s.displayStudentInfo();
        t.displayTeacherInfo();
    }
}
