package OOPS.Basics.Access_Modifier;

public class TestAccess {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        // System.out.println(obj.a); Can't be accessed
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}