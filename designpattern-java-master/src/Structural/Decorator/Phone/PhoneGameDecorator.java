package Structural.Decorator.Phone;

public class PhoneGameDecorator extends PhoneDecorator  {

    public PhoneGameDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void feature() {
        phone.feature();
        this.playgame();
    }

    /**
     * 实体装饰类中的自定义功能
     */
    public void playgame(){
        System.out.println("功能：游戏");
    }
}
