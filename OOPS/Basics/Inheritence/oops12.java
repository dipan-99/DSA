package OOPS.Basics.Inheritence;

public class oops12 {
    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    static class Manager extends Employee {
        String department;
        int teamSize;

        Manager(String name, double salary, String department, int teamSize) {
            super(name, salary); // Every constructor must call a parent constructor first. If you don't
                                 // explicitly write super(...), Java automatically tries super().
                                 // And super() only works if the parent has a no-argument constructor.
            this.department = department;
            this.teamSize = teamSize;
        }

        void display() {
            System.out.println("Name: " + super.name);
            System.out.println("salary: " + super.salary);
            System.out.println("Department: " + this.department);
            System.out.println("Team Size: : " + this.teamSize);
        }
    }

    public static void main(String[] args) {
        Manager m = new Manager(
                "Dipan",
                80000,
                "Engineering",
                10);

        m.display();
    }
}
