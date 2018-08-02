package Creational.FactoryMethod;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        HumanFactoryInterface chineseFactory = new ChineseFactory();
        Human simpleChinses = chineseFactory.getInstance();
        simpleChinses.country();

        Human simpleChinses2 = chineseFactory.getInstance();
        simpleChinses2.country();

        HumanFactoryInterface americanFacotry = new AmericanFactory();
        Human simpleAmerican = americanFacotry.getInstance();
        simpleAmerican.country();

        HumanFactoryInterface japaneseFactory = new JapaneseFactory();
        Human simpleJapanese = japaneseFactory.getInstance();
        simpleJapanese.country();

        //创建新国家人类
        HumanFactoryInterface cesarFacory = new CesarFactory();
        Human simpleCesar = cesarFacory.getInstance();
        simpleCesar.country();

    }
}
