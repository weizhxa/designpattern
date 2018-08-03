package creational.factorymethod.factorymethod;

public class AddOperatorFactory implements OperatorFactory {
    @Override
    public Operator generateOperator() {
        return new AddOperator();
    }
}
