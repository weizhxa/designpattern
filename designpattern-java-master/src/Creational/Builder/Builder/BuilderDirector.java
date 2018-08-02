package Creational.Builder.Builder;

import Creational.Builder.Car.Car;

public class BuilderDirector {
    private BuilderInterface builder = null;

    /**
     * 依赖注入
     * @param builder
     */
    public BuilderDirector(BuilderInterface builder) {
        this.builder = builder;
    }

    public Car build(){
        builder.buildWheel();
        builder.buildSeat();
        builder.buildEngine();
        return builder.getCar();
    }
}
