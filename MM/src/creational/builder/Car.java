package creational.builder;

public class Car {
    private Engine engine;
    private Seat seat;
    private Wheel wheel;

    private Car() {

    }

    public static class Builder implements ICar {
        private Engine engine;
        private Seat seat;
        private Wheel wheel;

        public Car build() {
            Car car = new Car();
            engine.getName();
            seat.getName();
            wheel.getName();
            car.engine = engine;
            car.seat = seat;
            car.wheel = wheel;
            return car;
        }

        @Override
        public ICar setSeat(Seat seat) {
            this.seat = seat;
            return this;
        }

        @Override
        public ICar setWheel(Wheel wheel) {
            this.wheel = wheel;
            return this;
        }

        @Override
        public ICar setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }
    }
}
