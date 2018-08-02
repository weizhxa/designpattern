package Creational.Builder.Builder;

import Creational.Builder.Car.Car;
import Creational.Builder.Car.Engine2500cc;
import Creational.Builder.Car.SeatLeather;
import Creational.Builder.Car.Wheel18;

public class MiddleCarBuilder implements BuilderInterface {
    Car middleCar = new Car();

    @Override
    public void buildEngine() {
        middleCar.setPart(new Engine2500cc());
    }

    @Override
    public void buildWheel() {
        middleCar.setPart(new Wheel18());
    }

    @Override
    public void buildSeat() {
        middleCar.setPart(new SeatLeather());
    }

    @Override
    public Car getCar() {
        return middleCar;
    }
}
