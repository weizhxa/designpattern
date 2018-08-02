package Behavioral.Mediator;

public class Main {
    public static void main(String[] args) {
        CarMediator mediator = new CarMediator();

        Colleague c1 = new Buyer("name-1", 1000, mediator);
        Colleague c2 = new Seller("car-1", 1000, mediator);

        mediator.setBuyer(c1);
        mediator.setSeller(c2);

        c1.getMediator().trade(c2);
    }
}
