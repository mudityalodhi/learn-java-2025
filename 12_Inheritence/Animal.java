class Animal {
    String type = "Animal";

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    String type = "Dog";

    void printType() {
        System.out.println(super.type); // Animal
    }

    void eat() {
        super.eat(); // Call parent method
        System.out.println("Dog eats too");
    }
}
