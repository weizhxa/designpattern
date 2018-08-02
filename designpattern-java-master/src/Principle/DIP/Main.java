package Principle.DIP;

/**
 * Dependency Inversion Principle
 * 依赖倒置原则
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("------新建三洋电池、佳能镜头--------");
        Iphone iphone = new Iphone(new Sanyo(), new Canon());

        iphone.display();


        System.out.println("------将电池更换为Nanfu--------");
        iphone.setBattery(new Nanfu());
        iphone.display();

        System.out.println("------将镜头更换为蔡司--------");
        iphone.setCamera(new Zeiss());
        iphone.display();
    }
}
