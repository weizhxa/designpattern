package Creational.Builder.Builder;

import Creational.Builder.Car.Car;

public interface BuilderInterface {
    /**
     * 安装引擎
     */
    public void buildEngine();

    /**
     * 安装车轮
     */
    public void buildWheel();

    /**
     * 安装座椅
     */
    public void buildSeat();

    public Car getCar();
}
