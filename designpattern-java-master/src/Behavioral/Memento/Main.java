package Behavioral.Memento;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(120, 20, 6500);

        //手动设置回滚类
        Car carStatusBackup = new Car();
        carStatusBackup.setMileage(car.getMileage());
        carStatusBackup.setGas(car.getGas());
        carStatusBackup.setSpeed(car.getSpeed());

        car.showStatus();

        car.setSpeed(60);
        car.setGas(18);
        car.setMileage(7500);

        car.showStatus();

        //手动回滚
        car.setSpeed(carStatusBackup.getSpeed());
        car.setGas(carStatusBackup.getGas());
        car.setMileage(carStatusBackup.getMileage());

        car.showStatus();


        System.out.println("-------------");
        //使用备忘录模式
        Bus bus = new Bus(60, 300, 10000);
        Memento memento = bus.createMemento();

        bus.showStatus();

        bus.setSpeed(30);
        bus.setGas(200);
        bus.setMileage(12000);

        bus.showStatus();

        bus.setMemento(memento);

        bus.showStatus();

        System.out.println("--------------");
        //使用CareTaker角色

        Bus bus1 = new Bus(0,0,0);
        CareTaker careTaker = new CareTaker(bus1.createMemento());

        bus1.showStatus();

        bus1.setGas(20);
        bus1.setSpeed(10);
        bus1.setMileage(100);

        bus1.showStatus();

        //使用CareTaker获取Memento回滚
        bus1.setMemento(careTaker.getMemento());
        bus1.showStatus();
    }
}
