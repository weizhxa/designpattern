package Behavioral.Observer;

public class Main {
    public static void main(String[] args) {

        //自己实现的观察者模式

        Observer student1 = new Student("张三");
        Observer student2 = new Student("李四");
        Observer student3 = new Student("王五");

        Teacher teacher = new Teacher();
        teacher.addObserver(student1);
        teacher.addObserver(student2);
        teacher.addObserver(student3);

        teacher.setLesson("白日依山尽");

        System.out.println("-------------");

        teacher.setLesson("黄河入海流");

        //System.out.println(teacher.getObserverNum());

        System.out.println("------使用JAVA Util-------");

        Client c1 = new Client();
        Client c2 = new Client();
        Client c3 = new Client();

        Content content = new Content("Abcdefg");
        Server server = new Server();

        server.addObserver(c1);
        server.addObserver(c2);
        server.addObserver(c3);

        server.setContent(content);

        //System.out.println(server.countObservers());
    }
}