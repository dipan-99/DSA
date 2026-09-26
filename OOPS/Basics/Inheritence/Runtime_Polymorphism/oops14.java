package OOPS.Basics.Inheritence.Runtime_Polymorphism;

public class oops14 {
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
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();

        a1.sound();
        a2.sound();
        a3.sound();

        a2.eat();
    }
}
