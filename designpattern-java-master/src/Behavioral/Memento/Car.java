package Behavioral.Memento;

/**
 * 不使用备忘录模式
 */
public class Car {

    /**
     * 速度
     */
    private int speed;

    /**
     * 剩余油量
     */
    private int gas;

    /**
     * 里程数
     */
    private int mileage;

    public Car(int speed, int gas, int mileage) {
        this.speed = speed;
        this.gas = gas;
        this.mileage = mileage;
    }

    public Car() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void showStatus(){
        System.out.println("当前速度：" + speed + " 当前油量" + gas + " 当前里程数" + mileage);
    }
}
