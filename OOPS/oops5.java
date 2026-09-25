package OOPS;

public class oops5 {
    static class Book {
        String title;
        String author;
        double price;

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Atomic Habits", "James Clear", 499);
        Book b2 = new Book("Clean Code", "Robert Martin", 799);

        b1.display();
        b2.display();
    }
}
