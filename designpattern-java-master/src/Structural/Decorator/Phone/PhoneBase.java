package Structural.Decorator.Phone;

public class PhoneBase implements Phone {
    @Override
    public void feature() {
        System.out.println("功能：打电话");
    }
}
