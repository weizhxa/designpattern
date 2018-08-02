package Principle.LSP;

public class Dog implements Animal {//继承
    @Override //重写
    public void run() {
        System.out.println("狗：飞奔");
    }
}
