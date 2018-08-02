package Creational.Builder;

import Creational.Builder.Builder.*;
import Creational.Builder.Car.*;

public class Main {
    public static void main(String[] args) {

        //手动组装低配汽车
        System.out.println("=========客户端组装低配汽车=========");

        Part wheel14 = new Wheel14();
        Part engine1500cc = new Engine1500cc();
        Part seatCloth = new SeatCloth();

        Car car = new Car();
        car.setPart(wheel14);
        car.setPart(engine1500cc);
        car.setPart(seatCloth);

        car.catTest();

        //手动组装中配汽车
        System.out.println("=========客户端组装低配汽车=========");

        Part wheel18 = new Wheel18();
        Part engine2500cc = new Engine2500cc();
        Part seatLeather = new SeatLeather();

        Car carMiddle = new Car();
        carMiddle.setPart(wheel18);
        carMiddle.setPart(engine2500cc);
        carMiddle.setPart(seatLeather);

        carMiddle.catTest();


        //使用builder建造低配汽车
        System.out.println("=========使用builder组装低配汽车=========");
        BuilderInterface cheapBuilder = new CheapCarBuilder();

        cheapBuilder.buildEngine();
        cheapBuilder.buildWheel();
        cheapBuilder.buildSeat();

        Car cheapCar = cheapBuilder.getCar();
        cheapCar.catTest();

        //使用builder建造中配汽车
        System.out.println("=========使用builder组装中配汽车=========");
        BuilderInterface middleBuilder = new MiddleCarBuilder();

        middleBuilder.buildEngine();
        middleBuilder.buildWheel();
        middleBuilder.buildSeat();

        Car middlecar = middleBuilder.getCar();
        middlecar.catTest();

        //使用builder建造跑车
        System.out.println("=========使用super builder组装跑车=========");
        BuilderInterface superBuilder = new SuperCarBuilder();

        superBuilder.buildEngine();
        superBuilder.buildSeat();
        superBuilder.buildWheel();

        Car superCar = superBuilder.getCar();
        superCar.catTest();

        //使用导演角色创建car
        System.out.println("========使用导演创建car");
        BuilderInterface superCarBuilder = new SuperCarBuilder();
        BuilderDirector director = new BuilderDirector(superCarBuilder);
        Car newSuperCar = director.build();
        newSuperCar.catTest();
    }
}
