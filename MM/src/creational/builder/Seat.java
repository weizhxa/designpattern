package creational.builder;

public abstract class Seat {
    protected String name;

    public String getName(){
        System.out.println(name);
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
