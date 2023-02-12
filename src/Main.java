

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 4);
        animal.eat();
        animal.walk();

        Dog dog = new Dog("Dog");
        dog.eat();
        dog.walk();
        dog.bark();
    }
}
