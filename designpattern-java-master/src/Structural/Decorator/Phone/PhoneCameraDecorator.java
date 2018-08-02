package Structural.Decorator.Phone;

public class PhoneCameraDecorator extends PhoneDecorator {

    public PhoneCameraDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void feature() {
        phone.feature();
        this.camera();
    }

    /**
     * 实体装饰类中的自定义功能
     */
    public void camera() {
        System.out.println("功能：拍照");
    }
}
