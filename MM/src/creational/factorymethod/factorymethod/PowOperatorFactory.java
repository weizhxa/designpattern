package creational.factorymethod.factorymethod;

//添加一个N次方工厂方法
public class PowOperatorFactory implements OperatorFactory {
    @Override
    public Operator generateOperator() {
        return new PowOperator();
    }
}
