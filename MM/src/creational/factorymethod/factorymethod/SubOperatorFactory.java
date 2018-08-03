package creational.factorymethod.factorymethod;

public class SubOperatorFactory implements OperatorFactory {
    @Override
    public Operator generateOperator() {
        return new SubOperator();
    }
}
