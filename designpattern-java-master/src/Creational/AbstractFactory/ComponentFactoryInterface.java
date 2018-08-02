package Creational.AbstractFactory;

public interface ComponentFactoryInterface {
    public ComponentInterface createButton();
    public ComponentInterface createPanel();
    public ComponentInterface createSelect();
}
