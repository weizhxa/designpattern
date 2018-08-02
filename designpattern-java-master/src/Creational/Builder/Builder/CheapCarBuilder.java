package Creational.Builder.Builder;

import Creational.Builder.Car.Car;
import Creational.Builder.Car.Engine1500cc;
import Creational.Builder.Car.SeatCloth;
import Creational.Builder.Car.Wheel14;

public class CheapCarBuilder implements BuilderInterface {
    private Car cheapCar = new Car();

    @Override
    public void buildEngine() {
        cheapCar.setPart(new Engine1500cc());
    }

    @Override
    public void buildWheel() {
        cheapCar.setPart(new Wheel14());
    }

    @Override
    public void buildSeat() {
        cheapCar.setPart(new SeatCloth());
    }

    public Car getCar(){
        return cheapCar;
    }
}
