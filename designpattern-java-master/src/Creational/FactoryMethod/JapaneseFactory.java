package Creational.FactoryMethod;

public class JapaneseFactory implements HumanFactoryInterface {
    @Override
    public Human getInstance() throws IllegalAccessException, InstantiationException {
        System.out.println("Made in Japanese Foctory:");
        return Japanese.class.newInstance();
    }
}
