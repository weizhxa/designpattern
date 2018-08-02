package Behavioral.Mediator;

public class CarMediator extends Mediator {
    /**
     * 买家
     */
    private Colleague buyer;

    /**
     * 买家
     */
    private Colleague seller;

    public void setBuyer(Colleague buyer) {
        this.buyer = buyer;
    }

    public void setSeller(Colleague seller) {
        this.seller = seller;
    }

    /**
     * 交易
     * @param colleague
     * @param price
     */
    public void trade(Colleague colleague) {
        if (colleague == buyer){
            if (colleague.getPrice() == seller.getPrice()){
                System.out.println("交易成功");
            }
        }else
        {
            if (colleague.getPrice() == buyer.getPrice()){
                System.out.println("交易成功");
            }
        }
    }
}
