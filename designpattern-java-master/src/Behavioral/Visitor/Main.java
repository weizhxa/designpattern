package Behavioral.Visitor;

public class Main {
    public static void main(String[] args) {
        Visitor father = new Father();

        Children son = new Son();
        son.accept(father);

        Children daughter = new Daughter();
        daughter.accept(father);

        System.out.println("---------------");

        Visitor mother = new Mother();
        son.accept(mother);
        daughter.accept(mother);

        System.out.println("------使用ObjectStructure添加son---------");

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(son);

        objectStructure.takeCare(father);

        System.out.println("-------使用ObjectStructure添加daughter-----");
        objectStructure.add(daughter);
        objectStructure.takeCare(mother);
    }
}