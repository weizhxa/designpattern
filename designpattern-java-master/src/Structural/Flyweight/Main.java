package Structural.Flyweight;


public class Main {
    public static void main(String[] args) {
        //通过享元工厂获取配置对象
        MysqlConfig mysqlConfigVnnox = MysqlFlyweightFactory.getMysqlConfig("1.2.1.2");

        System.out.println(mysqlConfigVnnox);

        System.out.println(mysqlConfigVnnox.getHost());
        System.out.println(mysqlConfigVnnox.getPort());
        System.out.println(mysqlConfigVnnox.getUsername());
        System.out.println(mysqlConfigVnnox.getPassword());

        System.out.println("==============");

        MysqlConfig mysqlConfigCare = MysqlFlyweightFactory.getMysqlConfig("1.2.1.2");

        System.out.println(mysqlConfigCare);

        System.out.println(mysqlConfigCare.getHost());
        System.out.println(mysqlConfigCare.getPort());
        System.out.println(mysqlConfigCare.getUsername());
        System.out.println(mysqlConfigCare.getPassword());

        System.out.println("==============");

        MysqlConfig mysqlConfigBaidu = MysqlFlyweightFactory.getMysqlConfig("10.20.10.20");

        System.out.println(mysqlConfigBaidu);

        System.out.println(mysqlConfigBaidu.getHost());
        System.out.println(mysqlConfigBaidu.getPort());
        System.out.println(mysqlConfigBaidu.getUsername());
        System.out.println(mysqlConfigBaidu.getPassword());
    }
}
