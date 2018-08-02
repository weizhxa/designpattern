package Creational.SimpleFactory;

public class Main {
    public static void main(String[] args) {

        //原始用法
        PersonDNA person = new PersonDNA("张三");
        person.talk();
        person.walk();

        PersonDNA person2 = new PersonDNA("李四");
        person2.talk();
        person2.walk();

        //简单工厂
        PersonFactory personFactory = new PersonFactory(1);

        PersonDNA person3 = personFactory.createPerson("麻五");
        person3.walk();
        person3.talk();

        PersonDNA person4 = personFactory.createPerson("赵六");
        person4.walk();
        person4.talk();

        //简单工厂
        PersonFactory personFactory2 = new PersonFactory(2);

        PersonDNA person5 = personFactory2.createPerson("王七");
        person5.walk();
        person5.talk();

        PersonDNA person6 = personFactory2.createPerson("田八");
        person6.walk();
        person6.talk();
    }
}
