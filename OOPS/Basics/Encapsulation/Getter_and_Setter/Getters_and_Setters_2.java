package OOPS.Basics.Encapsulation.Getter_and_Setter;

public class Getters_and_Setters_2 {
    static class Employee {
        private String name;
        private double salary;

        Employee(String name, double salary) {
            setName(name);
            setSalary(salary);
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public void setName(String name) {
            if (name == null || name.isEmpty()) {
                return;
            }

            this.name = name;
        }

        public void setSalary(double salary) {
            if (salary < 0) {
                return;
            }

            this.salary = salary;
        }

        public void giveRaise(double percentage) {
            if (percentage <= 0) {
                return;
            }

            this.salary += (this.salary * (percentage / 100));
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee("Dipan", 50000);

        e.giveRaise(10);
        System.out.println(e.getSalary());;
    }
}
