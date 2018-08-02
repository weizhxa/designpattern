package Behavioral.Strategy;

public class Main {
    public static void main(String[] args) {

        Context context = new Context();

        //使用文件存储策略
        Cache cache = new Cache();

        context.setStrategy(cache);
        context.save();

        //使用缓存存储策略
        File file = new File();

        context.setStrategy(file);
        context.save();

    }
}