package Structural.Decorator.Phone;

public class PhoneMessageDecorator extends PhoneDecorator {

    /**
     * super:调用父类中的构造方法
     * @param phone
     */
    public PhoneMessageDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void feature() {
        phone.feature();
        this.sendMessage();
    }

    /**
     * 实体装饰类中的自定义功能
     */
    public void sendMessage(){
        System.out.println("功能：发信息");
    }
}
