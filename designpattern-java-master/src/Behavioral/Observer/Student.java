package Behavioral.Observer;

public class Student implements Observer{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("学生：" + name + " 接收到老师新课程:" + msg);
    }
}
