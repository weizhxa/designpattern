package Creational.Builder.Car;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<Part> partList = new ArrayList<>();

    /**
     * 增加部件
     * @param part
     */
    public void setPart(Part part){
        partList.add(part);
    }

    public void catTest(){
        System.out.println("汽车零部件整体测试");
        for (Part part : partList){
            part.start();
        }
    }
}
