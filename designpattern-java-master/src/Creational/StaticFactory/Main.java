package Creational.StaticFactory;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

        //原始用法
        Fruit apple = new Apple();
        apple.color();
        apple.shape();

        Fruit watermelon = new Watermelon();
        watermelon.color();
        watermelon.shape();

        System.out.println("=========");

        //静态工厂用法
        Fruit apple2 = StaticFactory.createApple();
        apple2.color();
        apple2.shape();

        Fruit watermelon2 = StaticFactory.createWatermelon();
        watermelon2.color();
        watermelon2.shape();

        System.out.println("=========");

        //静态工厂优化
//        Fruit apple3 = StaticFactory.createFruit("Apple");
//        apple3.shape();
//        apple3.color();
//
//        Fruit watermelon3 = StaticFactory.createFruit("Watermelon");
//        watermelon3.color();
//        watermelon3.shape();

        Fruit apple4 = StaticFactory.createFruit("Creational.StaticFactory.Apple");
        apple4.color();
        apple4.shape();
    }
}
