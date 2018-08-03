package creational.factorymethod.simplefactory;

public class PowOperator implements Operator {
    @Override
    public void operate(double a, double b) {
        System.out.println("a ^ b = " + Math.pow(a, b));
    }
}
