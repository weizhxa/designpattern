package Behavioral.Mediator;

public abstract class Colleague {

    /**
     * 姓名
     */
    protected String name;

    /**
     * 车价
     */
    protected int price;

    /**
     * 中介者
     */
    protected Mediator mediator;

    public Colleague(String name, int price, Mediator mediator) {
        this.name = name;
        this.price = price;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void showMessage();
}
