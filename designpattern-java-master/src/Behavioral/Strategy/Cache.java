package Behavioral.Strategy;

public class Cache implements Strategy {
    @Override
    public void save() {
        System.out.println("使用缓存器存储");
    }
}
