package Principle.LOD;

/**
 * 迪米特法则
 * Low of Demeter
 */
public class Main {


    public static void main(String[] args) {
        //直接耦合
        Dog dog = new Dog("旺财");
        Person person = new Person("小红");

        person.talkToDog("蹲下", dog);
        dog.barkToPerson("汪汪汪", person);

        //使用第三方转发
        System.out.println("======使用第三折转发=============");
        Adapter adapter = new Adapter();
        adapter.communicate("汪汪汪汪，铲屎官", dog, person);
        adapter.communicate("汪星人你好", person, dog);

    }
}
