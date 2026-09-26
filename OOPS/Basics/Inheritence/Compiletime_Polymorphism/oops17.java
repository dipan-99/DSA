package OOPS.Basics.Inheritence.Compiletime_Polymorphism;

public class oops17 {
    static class Test {

        void show(int x) {
            System.out.println("int");
        }

        void show(long x) {
            System.out.println("long");
        }

        void show(double x) {
            System.out.println("double");
        }
    }

    public static void main(String[] args) {
        Test t = new Test();

        byte a = 10;
        short b = 20;
        int d = 30;
        long e = 40L;
        float f = 50.5f;
        double g = 60.5;

        t.show(a);
        t.show(b);
        t.show(d);
        t.show(e);
        t.show(f);
        t.show(g);
    }
}
