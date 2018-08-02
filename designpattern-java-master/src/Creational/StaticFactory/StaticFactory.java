package Creational.StaticFactory;

public class StaticFactory {

    public static Fruit createApple()
    {
        System.out.println("使用静态工厂生产苹果");
        Fruit apple = new Apple();
        return apple;
    }

    public static Fruit createWatermelon()
    {
        System.out.println("使用静态工厂生产西瓜");
        Fruit watermelon = new Watermelon();
        return watermelon;
    }

    /**
     * 静态方法
     * @param name
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static Fruit createFruit(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        System.out.println("接受到参数：" + name);

//        if (name.equalsIgnoreCase("apple"))
//        {
//            return Apple.class.newInstance();
//        }
//        else if (name.equalsIgnoreCase("watermelon"))
//        {
//            return Watermelon.class.newInstance();
//        }
//        else
//        {
//            System.out.println("找不到响应的类");
//            return null;
//        }

        Class fruit = Class.forName(name);
        return (Fruit) fruit.newInstance();

    }
}
