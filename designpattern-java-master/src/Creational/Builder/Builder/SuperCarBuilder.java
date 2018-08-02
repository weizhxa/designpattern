package Creational.Builder.Builder;

import Creational.Builder.Car.Car;
import Creational.Builder.Car.Engine5000cc;
import Creational.Builder.Car.SeatCarbon;
import Creational.Builder.Car.Wheel24;

public class SuperCarBuilder implements BuilderInterface {
    private Car superCar = new Car();

    @Override
    public void buildEngine() {
        superCar.setPart(new Engine5000cc());
    }

    @Override
    public void buildWheel() {
        superCar.setPart(new Wheel24());
    }

    @Override
    public void buildSeat() {
        superCar.setPart(new SeatCarbon());
    }

    @Override
    public Car getCar() {
        return superCar;
    }
}
