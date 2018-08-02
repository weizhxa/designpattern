package Structural.Filter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Part> parts = new ArrayList<>();
        ArrayList<Part> partsFilterResult = new ArrayList<>();

        Part part = new Part(1, 1, 1,1);
        Part part1 = new Part(2,2,2,2);
        Part part2 = new Part(3,3,3,3);
        Part part3 = new Part(4,4,4,4);
        Part part4 = new Part(5,5,5,5);
        Part part5 = new Part(6,6,6,6);

        parts.add(part);
        parts.add(part1);
        parts.add(part2);
        parts.add(part3);
        parts.add(part4);
        parts.add(part5);

        //过滤掉高度大于3的
        for (Part singlePart : parts){
            if (singlePart.getHeight() == 6)
            {
                partsFilterResult.add(singlePart);
            }
        }
        display(partsFilterResult);
        partsFilterResult.clear();

        //过滤掉重量小于4的
        for (Part singlePart : parts){
            if (singlePart.getWidth() == 1)
            {
                partsFilterResult.add(singlePart);
            }
        }
        display(partsFilterResult);
        partsFilterResult.clear();


        //过滤掉长度等于3而且宽度等于3的
        for (Part singlePart : parts){
            if (singlePart.getLongs() == 3 && singlePart.getWidth() == 3)
            {
                partsFilterResult.add(singlePart);
            }
        }
        display(partsFilterResult);
        partsFilterResult.clear();

        FilterInterface filter = new GreaterThan(3);
        display(filter.filterAction(parts));

    }

    /**
     * 展示结果
     * @param partArrayList
     */
    public static void display(ArrayList<Part> partArrayList){
        System.out.println("-------------");

        for (Part singlePart : partArrayList){
            System.out.println("重：" + singlePart.getWeight() + " 长：" + singlePart.getLongs() + " 宽：" + singlePart.getWidth() + " 高：" + singlePart.getHeight());
        }
    }
}
