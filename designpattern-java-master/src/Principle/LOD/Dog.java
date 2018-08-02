package Principle.LOD;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    /**
     * 犬吠
     */
    public void bark(String voice){
        System.out.println("(狗)" + name + " 叫：" + voice);
    }

    /**
     * 听到
     */
    public void listen(String voice){
        System.out.println("(狗)" + name + " 听到：" + voice);
    }

    public void barkToPerson(String voice, Person person){
        bark(voice);
        person.hear(voice);
    }
}