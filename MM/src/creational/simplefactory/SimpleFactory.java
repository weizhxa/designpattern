package creational.simplefactory;

public class SimpleFactory {

    public Fruit createFruit(String name) {
        return new Fruit(name);
    }
}
