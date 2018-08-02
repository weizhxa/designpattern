package Behavioral.Memento;

/**
 * 使用备忘录模式
 */
public class Bus {

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

    public Bus(int speed, int gas, int mileage) {
        this.speed = speed;
        this.gas = gas;
        this.mileage = mileage;
    }

    public Bus() {
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

    /**
     * 创建并返回备忘录对象
     * @return
     */
    public Memento createMemento(){
        return new Memento(speed, gas, mileage);
    }

    /**
     * 根据备忘录还原
     * @param memento
     */
    public void setMemento(Memento memento){
        this.speed = memento.getSpeed();
        this.gas = memento.getGas();
        this.mileage = memento.getMileage();
    }

}
