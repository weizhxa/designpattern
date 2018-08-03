package creational.builder;

public class Main {
    public static void main(String[] args) {
        Car.Builder car = new Car.Builder();
        car.setSeat(new SeatLeather());
        car.setEngine(new EngineBYD());
        car.setWheel(new Wheel14());
        car.build();

        Car.Builder car1 = new Car.Builder();
        car1.setSeat(new ClothLeather());
        car1.setEngine(new EngineToyoto());
        car1.setWheel(new Wheel16());
        car1.build();
    }
}
