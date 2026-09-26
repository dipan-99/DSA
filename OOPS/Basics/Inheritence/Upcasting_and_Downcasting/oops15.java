package OOPS.Basics.Inheritence.Upcasting_and_Downcasting;

public class oops15 {
    static class Animal {
        void eat() {
            System.out.println("Eating");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Barking");
        }
    }

    static class Cat extends Animal {
        void meow() {
            System.out.println("Meowing");
        }
    }

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Animal();

        a1.eat();
        a2.eat();
        a3.eat();

        if (a1 instanceof Dog) {
            Dog d = (Dog) a1;
            d.bark();
        }

        if (a2 instanceof Cat) {
            Cat c = (Cat) a2;
            c.meow();
        }

        // Animal a = new Cat();
        // Dog d = (Dog) a; ---> Gives ClassCastException
    }
}
