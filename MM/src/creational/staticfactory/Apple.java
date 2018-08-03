package creational.staticfactory;

public class Apple extends Fruit {
    public Apple() {
        super("Apple");
    }

    @Override
    public void sayHello() {
        System.out.println("I'm green.");
    }
}
