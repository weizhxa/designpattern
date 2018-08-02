package Behavioral.Mediator;

public class Buyer extends Colleague {

    public Buyer(String name, int price, Mediator mediator) {
        super(name, price, mediator);
    }

    @Override
    public void showMessage() {
        System.out.println("我是买家，我的名字叫:" + name + " 我的预算是：" + price);
    }
}
