package Principle.DIP;

public class Nanfu implements Battery {
    @Override
    public void install() {
        System.out.println("安装南孚电池");
    }

    @Override
    public void charge() {
        System.out.println("南孚电池充电");
    }

    @Override
    public void disCharge() {
        System.out.println("南孚电池放电");
    }
}
