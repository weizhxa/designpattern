package Creational.FactoryMethod;

public class CesarFactory implements HumanFactoryInterface {
    @Override
    public Human getInstance() throws IllegalAccessException, InstantiationException {
        System.out.println("Made in Cesar Facotry:");
        return Cesar.class.newInstance();
    }
}
