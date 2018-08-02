package Creational.SimpleFactory;

public class PersonFactory {

    String personIQ;

    public PersonFactory(Integer IQ)
    {
        personIQ = (IQ == 1) ? "高智商" : "高情商";
    }

    public PersonDNA createPerson(String name)
    {
        System.out.println(personIQ + "工厂产生：" + personIQ + "-" + name);
        PersonDNA person = new PersonDNA(name);
        return person;
    }
}
