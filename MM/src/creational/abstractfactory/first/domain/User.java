package creational.abstractfactory.first.domain;

public class User {
    private String name;
    private int age;

    public User(String s, int i) {
        this.name = s;
        this.age=  i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
