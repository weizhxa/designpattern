package Principle.DIP;

public class Sanyo implements Battery {
    @Override
    public void install() {
        System.out.println("安装三洋电池");
    }

    @Override
    public void charge() {
        System.out.println("三洋电池充电");
    }

    @Override
    public void disCharge() {
        System.out.println("三洋电池放电");
    }
}
