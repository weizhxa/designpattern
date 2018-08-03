package creational.simplefactory;

public class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("I'm " + name);
    }
}
