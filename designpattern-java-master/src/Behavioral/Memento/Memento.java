package Behavioral.Memento;

public class Memento {
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

    public Memento(int speed, int gas, int mileage) {
        this.speed = speed;
        this.gas = gas;
        this.mileage = mileage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGas() {
        return gas;
    }

    public int getMileage() {
        return mileage;
    }
}
