// Dynamic Method Dispatch is Java’s way of choosing the overridden method of the actual object at runtime, enabling runtime polymorphism.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal a;  // reference of parent type

        a = new Dog(); 
        a.sound(); // Output: Dog barks (decided at runtime)

        a = new Cat(); 
        a.sound(); // Output: Cat meows (decided at runtime)
    }
}
