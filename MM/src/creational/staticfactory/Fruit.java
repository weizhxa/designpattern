package creational.staticfactory;

public abstract class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public void print() {
        System.out.print("I'm " + name + ". ");
        sayHello();
    }

    protected abstract void sayHello();
}
