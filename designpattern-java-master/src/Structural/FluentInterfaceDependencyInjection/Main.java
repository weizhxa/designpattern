package Structural.FluentInterfaceDependencyInjection;
//
//import org.picocontainer.DefaultPicoContainer;
//import org.picocontainer.MutablePicoContainer;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.say("a").sing("b").think("c");


//        /**
//         * 使用容器
//         */
//        MutablePicoContainer picoContainer = new DefaultPicoContainer();
//
//        //注册普通类
//        picoContainer.addComponent(Person.class);
//        //从容器获取
//        Person person1 = (Person) picoContainer.getComponent(Person.class);
//        person1.sing("ddd");
//
//        //手动管理依赖
//        Mysql mysql = new Mysql();
//        Storage storage = new Storage(mysql);
//
//        //使用容器
//        picoContainer.addComponent(Mysql.class);
//        picoContainer.addComponent(Storage.class);
//
//        Storage storage1 = picoContainer.getComponent(Storage.class);


    }
}
