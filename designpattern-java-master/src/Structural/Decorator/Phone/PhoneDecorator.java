package Structural.Decorator.Phone;

public abstract class PhoneDecorator implements Phone {

    /**
     * 保护类型，继承类可以使用
     */
    protected Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }
}
