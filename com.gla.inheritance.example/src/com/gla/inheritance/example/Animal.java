
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {   // Child class
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();   // object creation

        d.eat();   // parent class method
        d.bark();  // child class method
    }
}