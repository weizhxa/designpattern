package Structural.Decorator.Person;

public class PersonSing extends PersonDecorator {

    public PersonSing(Person person) {
        super(person);
    }

    @Override
    public void ability() {
        person.ability();
        this.sing();
    }

    public void sing(){
        System.out.println("能力：唱歌");
    }
}
