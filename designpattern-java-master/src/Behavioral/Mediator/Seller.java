package Behavioral.Mediator;

public class Seller extends Colleague {


    public Seller(String name, int price, Mediator mediator) {
        super(name, price, mediator);
    }

    @Override
    public void showMessage() {
        System.out.println("我是卖家，我的名字叫:" + name + " 我的卖价是：" + price);
    }
}
