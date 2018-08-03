package creational.factorymethod.factorymethod;

public class SubOperator implements Operator {
    @Override
    public void operate(double a, double b) {
        System.out.println("a - b = " + (a - b));
    }
}
