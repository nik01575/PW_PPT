// Superclass Animal
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog
class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat
class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Subclass Cow
class Cow extends Animal {
    public void makeSound() {
        System.out.println("The cow moos.");
    }
}

public class FirstQue {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();  // The animal makes a sound.
        
        Dog dog = new Dog();
        dog.makeSound();     // The dog barks.
        
        Cat cat = new Cat();
        cat.makeSound();     // The cat meows.
        
        Cow cow = new Cow();
        cow.makeSound();     // The cow moos.
    }
}
