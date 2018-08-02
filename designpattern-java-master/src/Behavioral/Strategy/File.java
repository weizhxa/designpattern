package Behavioral.Strategy;

public class File implements Strategy {
    @Override
    public void save() {
        System.out.println("使用文件存储");
    }
}
