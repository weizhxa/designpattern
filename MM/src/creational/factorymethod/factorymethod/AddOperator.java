package creational.factorymethod.factorymethod;

public class AddOperator implements Operator {
    @Override
    public void operate(double a, double b) {
        System.out.println("a + b = " + (a + b));
    }
}
