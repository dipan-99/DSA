package OOPS.Basics;

public class oops1 {
    static class Car {
        String brand;
        String model;
        int price;

        void display() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand = "BMW";
        c1.model = "M4";
        c1.price = 8500000;

        c2.brand = "Audi";
        c2.model = "R8";
        c2.price = 20000000;

        c1.display();
        System.out.println();
        c2.display();
    }
}
