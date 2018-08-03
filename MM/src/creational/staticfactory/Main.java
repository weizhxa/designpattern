package creational.staticfactory;

public class Main {
    public static void main(String[] args) {
        StaticFactory staticFactory = new StaticFactory();
        Apple apple = staticFactory.createApple();
        apple.print();

        Orange orange = staticFactory.createOrange();
        orange.print();

        Fruit fruit1 = staticFactory.createFruit(Orange.class.getName());
        fruit1.print();

        Fruit fruit2 = staticFactory.createFruit(Apple.class.getName());
        fruit2.print();
    }
}
