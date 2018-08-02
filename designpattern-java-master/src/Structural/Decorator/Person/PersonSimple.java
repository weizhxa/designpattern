package Structural.Decorator.Person;

public class PersonSimple implements Person {
    @Override
    public void ability() {
        System.out.println("基本能力：说话/走路/睡觉");
    }
}
