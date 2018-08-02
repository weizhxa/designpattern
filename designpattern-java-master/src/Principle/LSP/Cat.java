package Principle.LSP;

public class Cat implements Animal {//继承
    @Override //重写
    public void run() {
        System.out.println("猫：飞奔");
    }
}
