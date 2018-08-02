package Structural.Decorator.Person;

public class PersonDance extends PersonDecorator {

    public PersonDance(Person person) {
        super(person);
    }

    @Override
    public void ability() {
        person.ability();
        this.dance();
    }

    public void dance() {
        System.out.println("能力：跳舞");
    }
}
