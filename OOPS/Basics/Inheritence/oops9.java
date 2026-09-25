package OOPS.Basics.Inheritence;

public class oops9 {
    static class Vehicle {
        String brand;
        int speed;

        void start() {
            System.out.println("Vehicle started");
        }

        void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Speed: " + speed);
        }
    }

    static class Car extends Vehicle {
        int numberOfDoors;

        void honk() {
            System.out.println("Car is honking");
        }
    }

    public static void main(String[] args) {
        Car c = new Car();

        c.brand = "BMW";
        c.speed = 200;
        c.numberOfDoors = 4;

        c.start();
        c.displayInfo();
        c.honk();
    }
}
