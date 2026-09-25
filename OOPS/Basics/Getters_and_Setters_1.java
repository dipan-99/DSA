package OOPS.Basics;

public class Getters_and_Setters_1 {
    static class Student {
        private String name;
        private int age;
        private double marks;

        Student(String name, int age, double marks) {
            this.name = name;
            this.age = age;
            this.marks = marks;

            // OR

            setName(name);
            setAge(age);
            setMarks(marks);
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getMarks() {
            return marks;
        }

        void setAge(int age) {
            if (0 < age && age <=100) {
                this.age = age;
            }
        }

        void setMarks(double marks) {
            if (0 <= marks && marks <= 100) {
                this.marks = marks;
            }
        }

        void setName(String name) {
            if (name == null || name.equals("")) {
                return;
            }

            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Dipan", 20, 85);

        // Works ---

        s1.setAge(21);
        s1.setMarks(95);

        //Doesnt Work ---

        s1.setAge(-10);
        s1.setMarks(150);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getMarks());
    }
}