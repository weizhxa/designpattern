package Creational.FactoryMethod;

public class AmericanFactory implements HumanFactoryInterface {

    public Human getInstance() throws IllegalAccessException, InstantiationException {
        System.out.println("Made in American Foctory:");
        return American.class.newInstance();
    }
}
