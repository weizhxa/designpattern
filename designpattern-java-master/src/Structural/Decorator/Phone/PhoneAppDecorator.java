package Structural.Decorator.Phone;

public class PhoneAppDecorator extends PhoneDecorator {

    /**
     * super:调用父类中的构造方法
     * @param phone
     */
    public PhoneAppDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void feature() {
        phone.feature();
    }

    /**
     * 实体装饰类中的自定义功能
     */
    public void install(){
        System.out.println("功能：安装APP");
    }
}
