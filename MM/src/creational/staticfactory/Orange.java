package creational.staticfactory;

public class Orange extends Fruit {
    public Orange() {
        super("Orange");
    }

    @Override
    public void sayHello() {
        System.out.println("I'm orange.");
    }
}
