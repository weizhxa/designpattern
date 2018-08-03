package creational.builder;

public abstract class Wheel {
    protected String name;

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
