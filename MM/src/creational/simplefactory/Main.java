package creational.simplefactory;

public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Fruit apple = simpleFactory.createFruit("Apple");
        apple.print();

        Fruit orange = simpleFactory.createFruit("Orange");
        orange.print();
    }
}
