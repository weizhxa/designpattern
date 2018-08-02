package Creational.Prototype;

public class Main {
    public static void main(String[] args) {

        //浅度复制
        Mysql mysql1 = new Mysql();

        mysql1.setHost("192.168.1.1");
        mysql1.setPort(3306);
        mysql1.setUsername("root");
        mysql1.setPassword("123456");

        System.out.println("mysql-1实例：");
        System.out.println(mysql1.getHost());
        System.out.println(mysql1.getPort());
        System.out.println(mysql1.getUsername());
        System.out.println(mysql1.getPassword());

        System.out.println("==========");

        Mysql mysql2 = mysql1.clone();
        System.out.println("mysql-2实例：");
        mysql2.setHost("0.0.0.0");
        System.out.println(mysql2.getHost());
        System.out.println(mysql2.getPort());
        System.out.println(mysql2.getUsername());
        System.out.println(mysql2.getPassword());

        System.out.println("=====深度复制=====");

        //深度复制
        Config config = new Config();
        config.setHost("1.1.1.1");
        config.setPort(1207);


        System.out.println("mongo-1实例：");
        Mongo mongo = new Mongo( config );
        Config configOfMongo = mongo.getConfig();
        System.out.println(configOfMongo.getHost());
        System.out.println(configOfMongo.getPort());

        System.out.println("mongo-2实例：");
        Mongo mongo1 = mongo.clone();
        Config configOfMongo1 = mongo1.getConfig();
        System.out.println(configOfMongo1.getHost());
        System.out.println(configOfMongo1.getPort());

        System.out.println("=====修改其中一个引用=====");


        //修改mongo-1 中的configOfMongo实例
        configOfMongo.setHost("0.0.0.0");

        System.out.println(configOfMongo.getHost());
        System.out.println(configOfMongo.getPort());


        System.out.println(configOfMongo1.getHost());
        System.out.println(configOfMongo1.getPort());
    }
}
