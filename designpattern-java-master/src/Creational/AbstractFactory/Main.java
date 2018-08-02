package Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        //获取安卓产品族的不同产品
        ComponentFactoryInterface androidFactory = new AndroidFactory();
        Button androidButton = (Button) androidFactory.createButton();
        Panel androidPanel = (Panel) androidFactory.createPanel();
        Select androidSelect = (Select) androidFactory.createSelect();

        androidButton.click();
        androidPanel.display();
        androidSelect.dropDown();

        System.out.println("===============");

        //获取IOS产品族的产品
        ComponentFactoryInterface iosFactory = new IosFactory();
        Button IosButton = (Button) iosFactory.createButton();
        Panel IosPanel = (Panel) iosFactory.createPanel();
        Select IosSelect = (Select) iosFactory.createSelect();

        IosButton.click();
        IosPanel.display();
        IosSelect.dropDown();

    }
}
