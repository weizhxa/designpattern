package Structural.FluentInterfaceDependencyInjection;

public class Person {

    public Person say(String word){
        System.out.println("说话：" + word);
        return this;
    }

    public Person sing(String song){
        System.out.println("唱歌:" + song);
        return this;
    }

    public Person think(String thing){
        System.out.println("思考：" + thing);
        return this;
    }
}
