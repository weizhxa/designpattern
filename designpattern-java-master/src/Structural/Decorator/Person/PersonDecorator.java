package Structural.Decorator.Person;

public abstract class PersonDecorator implements Person {

    /**
     * 保护类型，继承类可以使用
     */
    protected Person person;

    public PersonDecorator(Person person) {
        this.person = person;
    }
}
