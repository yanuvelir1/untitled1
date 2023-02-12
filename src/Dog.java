

public class Dog extends Animal {
    public Dog(String name) {
        super(name, 4);
    }

    public void bark() {
        System.out.println(this.name + " is barking.");
    }
}


