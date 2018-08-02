package Creational.FactoryMethod;

public class ChineseFactory implements HumanFactoryInterface {
    @Override
    public Human getInstance() throws IllegalAccessException, InstantiationException {
        System.out.println("Made in Chinese Foctory:");
        return Chinese.class.newInstance();
    }
}
