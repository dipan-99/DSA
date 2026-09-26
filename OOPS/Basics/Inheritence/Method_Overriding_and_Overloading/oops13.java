package OOPS.Basics.Inheritence.Method_Overriding_and_Overloading;

public class oops13 {
    static class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }

        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.sound();

        c.eat();
        c.sound();
    }
}
