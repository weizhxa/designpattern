package Principle.DIP;

public class Iphone {

    /**
     * 电池
     */
    private Battery battery;

    private Camera camera;

    public Iphone(Battery battery, Camera camera) {
        this.battery = battery;
        this.camera = camera;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    /**
     * 运行手机
     */
    public void display(){
        battery.install();
        camera.install();

        battery.charge();
        camera.picture();
        battery.disCharge();
        camera.video();
        battery.disCharge();
    }
}
