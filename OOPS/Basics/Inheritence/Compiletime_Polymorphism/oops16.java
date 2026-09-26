package OOPS.Basics.Inheritence.Compiletime_Polymorphism;

public class oops16 {
    static class Calculator {
        int multiply(int a, int b) {
            return a * b;
        }

        int multiply(int a, int b, int c) {
            return a * b * c;
        }

        double multiply(double a, double b) {
            return a * b;
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.multiply(2, 4));
        System.out.println(c.multiply(2, 4, 6));
        System.out.println(c.multiply(2.0, 4.0));
    }
}
