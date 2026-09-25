package OOPS.Basics;

public class oops7 {
    static class Product {
        String name;
        double price;
        int quantity;

        Product() {
            this("Unknown", 0.0, 0);
        }

        Product(String name, double price) {
            this(name, price, 1);
        }

        Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Laptop", 60000);
        Product p3 = new Product("Mouse", 1500, 3);

        p1.display();
        p2.display();
        p3.display();
    }
}
