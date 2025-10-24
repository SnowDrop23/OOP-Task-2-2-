/*
 Create a class Animal with method makeSound() printing "Animal making sound".

Create subclass Dog overriding makeSound() to print "Dog barking" and adding method fetch() printing "Fetching ball".

In Main:
* Assign a Dog object to an Animal reference.
* Call makeSound() on that reference (demonstrating dynamic method dispatch).


run in VS Code, to run in Eclipse just add public keyword at first both in parent and child class 
*/
class Animal {
    void makeSound() {
        System.out.println("Animal making sound!");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barking!");
    }

    void fetch() {
        System.out.println("Fetching Ball");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // Upcasting: Animal reference → Dog object
        a1.makeSound();         // Dynamic method dispatch
    }
}
