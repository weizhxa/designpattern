package Creational.AbstractFactory;

public class AndroidFactory implements ComponentFactoryInterface {

    public AndroidFactory(){
        System.out.println("安卓工厂将生产Android产品族");
    }

    @Override
    public ComponentInterface createButton() {
        return new ButtonAndroid();
    }

    @Override
    public ComponentInterface createPanel() {
        return new PanelAndroid();
    }

    @Override
    public ComponentInterface createSelect() {
        return new SelectAndroid();
    }
}
