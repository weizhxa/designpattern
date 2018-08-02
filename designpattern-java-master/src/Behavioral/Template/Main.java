package Behavioral.Template;

public class Main {
    public static void main(String[] args) {
        Person zhangsan = new Chinese("张三");
        zhangsan.life();

        System.out.println("----------");

        Person lucy = new American("lucy");
        lucy.life();
    }
}