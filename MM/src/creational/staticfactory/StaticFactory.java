package creational.staticfactory;

public class StaticFactory {
    public Apple createApple() {
        return new Apple();
    }

    public Orange createOrange() {
        return new Orange();
    }

    public Fruit createFruit(String clazz) {
        try {
            Class<?> fruit = Class.forName(clazz);
            return (Fruit) fruit.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
