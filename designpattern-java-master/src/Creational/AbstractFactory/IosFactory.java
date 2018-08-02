package Creational.AbstractFactory;

public class IosFactory implements ComponentFactoryInterface {

    public IosFactory(){
        System.out.println("IOS工厂将生产IOS产品族");
    }

    @Override
    public ComponentInterface createButton() {
        return new ButtonIos();
    }

    @Override
    public ComponentInterface createPanel() {
        return new PanelIos();
    }

    @Override
    public ComponentInterface createSelect() {
        return new SelectIos();
    }
}
