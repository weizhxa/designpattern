package Structural.FluentInterfaceDependencyInjection;

public class Storage {
    Mysql mysql;

    public Storage(Mysql mysql) {
        System.out.println("实例化storage");
        this.mysql = mysql;
    }
}
