package creational.builder;

public interface ICar {
    public ICar setSeat(Seat ISeat);

    public ICar setWheel(Wheel wheel);

    public ICar setEngine(Engine engine);
}
