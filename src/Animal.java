

public class Animal {protected String name;
    protected int legs;

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public void eat() {
        System.out.println(this.name + " is eating.");
    }

    public void walk() {
        System.out.println(this.name + " is walking on " + this.legs + " legs.");
    }
}
