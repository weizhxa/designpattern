package Creational.SimpleFactory;

public class PersonDNA {

    private String personName;

    public PersonDNA(String name) {
        personName = name;
    }

    public void talk()
    {
        System.out.println(personName + "说话");
    }

    public void walk()
    {
        System.out.println(personName + "走路");
    }
}
